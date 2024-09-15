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

public val BrandsGroup.Qq: ImageVector
    get() {
        if (_qq != null) {
            return _qq!!
        }
        _qq = Builder(name = "Qq", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(433.75f, 420.45f)
                curveToRelative(-11.53f, 1.39f, -44.86f, -52.74f, -44.86f, -52.74f)
                curveToRelative(0.0f, 31.34f, -16.14f, 72.25f, -51.05f, 101.79f)
                curveToRelative(16.84f, 5.19f, 54.84f, 19.17f, 45.8f, 34.42f)
                curveToRelative(-7.32f, 12.34f, -125.51f, 7.88f, -159.63f, 4.04f)
                curveToRelative(-34.12f, 3.84f, -152.32f, 8.31f, -159.63f, -4.04f)
                curveToRelative(-9.05f, -15.25f, 28.92f, -29.21f, 45.78f, -34.42f)
                curveToRelative(-34.92f, -29.54f, -51.06f, -70.44f, -51.06f, -101.79f)
                curveToRelative(0.0f, 0.0f, -33.33f, 54.13f, -44.86f, 52.74f)
                curveToRelative(-5.37f, -0.65f, -12.42f, -29.64f, 9.35f, -99.7f)
                curveToRelative(10.26f, -33.02f, 22.0f, -60.48f, 40.14f, -105.78f)
                curveTo(60.68f, 98.06f, 108.98f, 0.01f, 224.0f, 0.0f)
                curveToRelative(113.74f, 0.01f, 163.16f, 96.13f, 160.26f, 214.96f)
                curveToRelative(18.12f, 45.22f, 29.91f, 72.85f, 40.14f, 105.78f)
                curveToRelative(21.77f, 70.06f, 14.72f, 99.05f, 9.35f, 99.7f)
                close()
            }
        }
        .build()
        return _qq!!
    }

private var _qq: ImageVector? = null
