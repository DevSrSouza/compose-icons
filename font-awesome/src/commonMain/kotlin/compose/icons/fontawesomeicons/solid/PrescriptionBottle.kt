package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.PrescriptionBottle: ImageVector
    get() {
        if (_prescriptionBottle != null) {
            return _prescriptionBottle!!
        }
        _prescriptionBottle = Builder(name = "PrescriptionBottle", defaultWidth = 384.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 192.0f)
                horizontalLineToRelative(120.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, 3.6f, 8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 4.4f, -3.6f, 8.0f, -8.0f, 8.0f)
                horizontalLineTo(32.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(120.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, 3.6f, 8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 4.4f, -3.6f, 8.0f, -8.0f, 8.0f)
                horizontalLineTo(32.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(120.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, 3.6f, 8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 4.4f, -3.6f, 8.0f, -8.0f, 8.0f)
                horizontalLineTo(32.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.6f, 14.4f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(256.0f)
                curveToRelative(17.6f, 0.0f, 32.0f, -14.4f, 32.0f, -32.0f)
                verticalLineTo(128.0f)
                horizontalLineTo(32.0f)
                verticalLineToRelative(64.0f)
                close()
                moveTo(360.0f, 0.0f)
                horizontalLineTo(24.0f)
                curveTo(10.8f, 0.0f, 0.0f, 10.8f, 0.0f, 24.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 13.2f, 10.8f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(13.2f, 0.0f, 24.0f, -10.8f, 24.0f, -24.0f)
                verticalLineTo(24.0f)
                curveToRelative(0.0f, -13.2f, -10.8f, -24.0f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _prescriptionBottle!!
    }

private var _prescriptionBottle: ImageVector? = null
