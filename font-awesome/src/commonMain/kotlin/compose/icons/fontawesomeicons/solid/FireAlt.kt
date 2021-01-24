package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.FireAlt: ImageVector
    get() {
        if (_fireAlt != null) {
            return _fireAlt!!
        }
        _fireAlt = Builder(name = "FireAlt", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(323.56f, 51.2f)
                curveToRelative(-20.8f, 19.3f, -39.58f, 39.59f, -56.22f, 59.97f)
                curveTo(240.08f, 73.62f, 206.28f, 35.53f, 168.0f, 0.0f)
                curveTo(69.74f, 91.17f, 0.0f, 209.96f, 0.0f, 281.6f)
                curveTo(0.0f, 408.85f, 100.29f, 512.0f, 224.0f, 512.0f)
                reflectiveCurveToRelative(224.0f, -103.15f, 224.0f, -230.4f)
                curveToRelative(0.0f, -53.27f, -51.98f, -163.14f, -124.44f, -230.4f)
                close()
                moveTo(304.09f, 391.85f)
                curveTo(282.43f, 407.01f, 255.72f, 416.0f, 226.86f, 416.0f)
                curveTo(154.71f, 416.0f, 96.0f, 368.26f, 96.0f, 290.75f)
                curveToRelative(0.0f, -38.61f, 24.31f, -72.63f, 72.79f, -130.75f)
                curveToRelative(6.93f, 7.98f, 98.83f, 125.34f, 98.83f, 125.34f)
                lineToRelative(58.63f, -66.88f)
                curveToRelative(4.14f, 6.85f, 7.91f, 13.55f, 11.27f, 19.97f)
                curveToRelative(27.35f, 52.19f, 15.81f, 118.97f, -33.43f, 153.42f)
                close()
            }
        }
        .build()
        return _fireAlt!!
    }

private var _fireAlt: ImageVector? = null
