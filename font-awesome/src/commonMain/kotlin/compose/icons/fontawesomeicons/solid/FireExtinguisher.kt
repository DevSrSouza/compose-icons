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

public val SolidGroup.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) {
            return _fireExtinguisher!!
        }
        _fireExtinguisher = Builder(name = "FireExtinguisher", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(434.03f, 26.33f)
                lineToRelative(-168.0f, 28.0f)
                curveTo(254.69f, 56.22f, 256.0f, 67.8f, 256.0f, 72.0f)
                horizontalLineToRelative(-58.33f)
                curveTo(208.35f, 36.11f, 181.45f, 0.0f, 144.0f, 0.0f)
                curveToRelative(-39.44f, 0.0f, -66.37f, 39.68f, -52.23f, 76.2f)
                curveToRelative(-52.04f, 13.05f, -75.38f, 54.21f, -90.05f, 90.88f)
                curveToRelative(-4.92f, 12.31f, 1.06f, 26.27f, 13.37f, 31.2f)
                curveToRelative(12.32f, 4.93f, 26.28f, -1.08f, 31.2f, -13.37f)
                curveTo(75.06f, 112.99f, 106.96f, 120.0f, 168.0f, 120.0f)
                verticalLineToRelative(27.08f)
                curveToRelative(-41.54f, 10.86f, -72.0f, 49.24f, -72.0f, 94.13f)
                verticalLineTo(488.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(144.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                verticalLineTo(240.0f)
                curveToRelative(0.0f, -44.73f, -30.6f, -82.31f, -72.0f, -92.97f)
                verticalLineTo(120.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(0.0f, 2.97f, -1.7f, 15.72f, 10.03f, 17.67f)
                lineToRelative(168.0f, 28.0f)
                curveTo(441.34f, 166.89f, 448.0f, 161.25f, 448.0f, 153.83f)
                verticalLineTo(38.17f)
                curveToRelative(0.0f, -7.42f, -6.66f, -13.06f, -13.97f, -11.84f)
                close()
                moveTo(144.0f, 72.0f)
                curveToRelative(-8.82f, 0.0f, -16.0f, -7.18f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.18f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.18f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.18f, 16.0f, -16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
