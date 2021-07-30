package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Microblog: ImageVector
    get() {
        if (_microblog != null) {
            return _microblog!!
        }
        _microblog = Builder(name = "Microblog", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(399.36f, 362.23f)
                curveToRelative(29.49f, -34.69f, 47.1f, -78.34f, 47.1f, -125.79f)
                curveTo(446.46f, 123.49f, 346.86f, 32.0f, 224.0f, 32.0f)
                reflectiveCurveTo(1.54f, 123.49f, 1.54f, 236.44f)
                reflectiveCurveTo(101.14f, 440.87f, 224.0f, 440.87f)
                arcToRelative(239.28f, 239.28f, 0.0f, false, false, 79.44f, -13.44f)
                arcToRelative(7.18f, 7.18f, 0.0f, false, true, 8.12f, 2.56f)
                curveToRelative(18.58f, 25.09f, 47.61f, 42.74f, 79.89f, 49.92f)
                arcToRelative(4.42f, 4.42f, 0.0f, false, false, 5.22f, -3.43f)
                arcToRelative(4.37f, 4.37f, 0.0f, false, false, -0.85f, -3.62f)
                arcToRelative(87.0f, 87.0f, 0.0f, false, true, 3.69f, -110.69f)
                close()
                moveTo(329.52f, 212.4f)
                lineToRelative(-57.3f, 43.49f)
                lineTo(293.0f, 324.75f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -9.94f, 7.22f)
                lineTo(224.0f, 290.92f)
                lineTo(164.94f, 332.0f)
                arcToRelative(6.51f, 6.51f, 0.0f, false, true, -9.95f, -7.22f)
                lineToRelative(20.79f, -68.86f)
                lineToRelative(-57.3f, -43.49f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 3.8f, -11.68f)
                lineToRelative(71.88f, -1.51f)
                lineToRelative(23.66f, -67.92f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 12.28f, 0.0f)
                lineToRelative(23.66f, 67.92f)
                lineToRelative(71.88f, 1.51f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 3.88f, 11.68f)
                close()
            }
        }
        .build()
        return _microblog!!
    }

private var _microblog: ImageVector? = null
