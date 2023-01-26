package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.PrintDisabled: ImageVector
    get() {
        if (_printDisabled != null) {
            return _printDisabled!!
        }
        _printDisabled = Builder(name = "PrintDisabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.65f, 7.0f)
                lineTo(18.0f, 7.0f)
                lineTo(18.0f, 3.01f)
                lineTo(6.0f, 3.01f)
                verticalLineToRelative(0.35f)
                close()
                moveTo(10.66f, 8.01f)
                lineToRelative(9.0f, 8.99f)
                lineTo(22.0f, 17.0f)
                verticalLineToRelative(-5.99f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-8.34f)
                close()
                moveTo(19.0f, 10.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(1.41f, 1.6f)
                lineTo(0.0f, 3.01f)
                lineToRelative(5.0f, 5.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.33f, -3.0f, 2.99f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(12.0f)
                lineToRelative(2.95f, 2.96f)
                lineToRelative(1.41f, -1.41f)
                lineTo(1.41f, 1.6f)
                close()
                moveTo(8.0f, 19.01f)
                lineTo(8.0f, 15.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-8.0f, 0.01f)
                close()
            }
        }
        .build()
        return _printDisabled!!
    }

private var _printDisabled: ImageVector? = null
