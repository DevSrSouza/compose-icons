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

public val SolidGroup.LaptopMedical: ImageVector
    get() {
        if (_laptopMedical != null) {
            return _laptopMedical!!
        }
        _laptopMedical = Builder(name = "LaptopMedical", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                horizontalLineTo(512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                verticalLineTo(352.0f)
                horizontalLineTo(512.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(352.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(96.0f)
                close()
                moveTo(0.0f, 403.2f)
                curveTo(0.0f, 392.6f, 8.6f, 384.0f, 19.2f, 384.0f)
                horizontalLineTo(620.8f)
                curveToRelative(10.6f, 0.0f, 19.2f, 8.6f, 19.2f, 19.2f)
                curveToRelative(0.0f, 42.4f, -34.4f, 76.8f, -76.8f, 76.8f)
                horizontalLineTo(76.8f)
                curveTo(34.4f, 480.0f, 0.0f, 445.6f, 0.0f, 403.2f)
                close()
                moveTo(288.0f, 160.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(352.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(304.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineTo(272.0f)
                horizontalLineTo(240.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineTo(224.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(160.0f)
                close()
            }
        }
        .build()
        return _laptopMedical!!
    }

private var _laptopMedical: ImageVector? = null
