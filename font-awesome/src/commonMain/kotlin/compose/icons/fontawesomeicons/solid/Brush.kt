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

public val SolidGroup.Brush: ImageVector
    get() {
        if (_brush != null) {
            return _brush!!
        }
        _brush = Builder(name = "Brush", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 0.0f)
                lineTo(32.0f, 0.0f)
                curveTo(14.33f, 0.0f, 0.0f, 14.33f, 0.0f, 32.0f)
                verticalLineToRelative(224.0f)
                horizontalLineToRelative(384.0f)
                lineTo(384.0f, 32.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(0.0f, 320.0f)
                curveToRelative(0.0f, 35.35f, 28.66f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 35.35f, 28.66f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.65f, 64.0f, -64.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(35.34f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                verticalLineToRelative(-32.0f)
                lineTo(0.0f, 288.0f)
                verticalLineToRelative(32.0f)
                close()
                moveTo(192.0f, 424.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, 10.74f, 24.0f, 24.0f)
                curveToRelative(0.0f, 13.25f, -10.75f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.75f, -24.0f, -24.0f)
                curveToRelative(0.0f, -13.26f, 10.75f, -24.0f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _brush!!
    }

private var _brush: ImageVector? = null
