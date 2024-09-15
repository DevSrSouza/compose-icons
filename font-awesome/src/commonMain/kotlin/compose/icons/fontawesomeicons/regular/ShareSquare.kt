package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.ShareSquare: ImageVector
    get() {
        if (_shareSquare != null) {
            return _shareSquare!!
        }
        _shareSquare = Builder(name = "ShareSquare", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(561.94f, 158.06f)
                lineTo(417.94f, 14.09f)
                curveTo(387.93f, -15.92f, 336.0f, 5.1f, 336.0f, 48.03f)
                verticalLineToRelative(57.2f)
                curveToRelative(-42.45f, 1.88f, -84.03f, 6.55f, -120.76f, 17.99f)
                curveToRelative(-35.17f, 10.95f, -63.07f, 27.58f, -82.91f, 49.42f)
                curveTo(108.22f, 199.2f, 96.0f, 232.6f, 96.0f, 271.94f)
                curveToRelative(0.0f, 61.7f, 33.18f, 112.46f, 84.87f, 144.76f)
                curveToRelative(37.55f, 23.51f, 85.25f, -12.65f, 71.02f, -55.74f)
                curveToRelative(-15.52f, -47.12f, -17.16f, -70.92f, 84.11f, -78.76f)
                lineTo(336.0f, 336.0f)
                curveToRelative(0.0f, 42.99f, 51.97f, 63.91f, 81.94f, 33.94f)
                lineToRelative(144.0f, -144.0f)
                curveToRelative(18.75f, -18.74f, 18.75f, -49.14f, 0.0f, -67.88f)
                close()
                moveTo(384.0f, 336.0f)
                lineTo(384.0f, 232.16f)
                curveTo(255.31f, 234.08f, 166.49f, 255.35f, 206.31f, 376.0f)
                curveTo(176.79f, 357.55f, 144.0f, 324.08f, 144.0f, 271.94f)
                curveToRelative(0.0f, -109.33f, 129.14f, -118.95f, 240.0f, -119.85f)
                lineTo(384.0f, 48.0f)
                lineToRelative(144.0f, 144.0f)
                lineToRelative(-144.0f, 144.0f)
                close()
                moveTo(408.74f, 420.49f)
                arcToRelative(82.66f, 82.66f, 0.0f, false, false, 20.97f, -9.3f)
                curveToRelative(7.98f, -4.95f, 18.29f, 0.83f, 18.29f, 10.21f)
                lineTo(448.0f, 464.0f)
                curveToRelative(0.0f, 26.51f, -21.49f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 512.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                lineTo(0.0f, 112.0f)
                curveToRelative(0.0f, -26.51f, 21.49f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(132.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, 5.37f, 12.0f, 12.0f)
                verticalLineToRelative(4.49f)
                curveToRelative(0.0f, 4.92f, -2.99f, 9.37f, -7.57f, 11.15f)
                curveToRelative(-13.7f, 5.33f, -26.4f, 11.54f, -38.05f, 18.58f)
                arcToRelative(12.14f, 12.14f, 0.0f, false, true, -6.28f, 1.78f)
                lineTo(54.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(340.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(340.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                verticalLineToRelative(-25.97f)
                curveToRelative(0.0f, -5.37f, 3.58f, -10.06f, 8.74f, -11.54f)
                close()
            }
        }
        .build()
        return _shareSquare!!
    }

private var _shareSquare: ImageVector? = null
