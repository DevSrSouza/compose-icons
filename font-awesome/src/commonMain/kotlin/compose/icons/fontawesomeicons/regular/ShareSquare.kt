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
                moveTo(561.938f, 158.06f)
                lineTo(417.94f, 14.092f)
                curveTo(387.926f, -15.922f, 336.0f, 5.097f, 336.0f, 48.032f)
                verticalLineToRelative(57.198f)
                curveToRelative(-42.45f, 1.88f, -84.03f, 6.55f, -120.76f, 17.99f)
                curveToRelative(-35.17f, 10.95f, -63.07f, 27.58f, -82.91f, 49.42f)
                curveTo(108.22f, 199.2f, 96.0f, 232.6f, 96.0f, 271.94f)
                curveToRelative(0.0f, 61.697f, 33.178f, 112.455f, 84.87f, 144.76f)
                curveToRelative(37.546f, 23.508f, 85.248f, -12.651f, 71.02f, -55.74f)
                curveToRelative(-15.515f, -47.119f, -17.156f, -70.923f, 84.11f, -78.76f)
                lineTo(336.0f, 336.0f)
                curveToRelative(0.0f, 42.993f, 51.968f, 63.913f, 81.94f, 33.94f)
                lineToRelative(143.998f, -144.0f)
                curveToRelative(18.75f, -18.74f, 18.75f, -49.14f, 0.0f, -67.88f)
                close()
                moveTo(384.0f, 336.0f)
                lineTo(384.0f, 232.16f)
                curveTo(255.309f, 234.082f, 166.492f, 255.35f, 206.31f, 376.0f)
                curveTo(176.79f, 357.55f, 144.0f, 324.08f, 144.0f, 271.94f)
                curveToRelative(0.0f, -109.334f, 129.14f, -118.947f, 240.0f, -119.85f)
                lineTo(384.0f, 48.0f)
                lineToRelative(144.0f, 144.0f)
                lineToRelative(-144.0f, 144.0f)
                close()
                moveTo(408.74f, 420.493f)
                arcToRelative(82.658f, 82.658f, 0.0f, false, false, 20.974f, -9.303f)
                curveToRelative(7.976f, -4.952f, 18.286f, 0.826f, 18.286f, 10.214f)
                lineTo(448.0f, 464.0f)
                curveToRelative(0.0f, 26.51f, -21.49f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 512.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                lineTo(0.0f, 112.0f)
                curveToRelative(0.0f, -26.51f, 21.49f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(132.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, 5.373f, 12.0f, 12.0f)
                verticalLineToRelative(4.486f)
                curveToRelative(0.0f, 4.917f, -2.987f, 9.369f, -7.569f, 11.152f)
                curveToRelative(-13.702f, 5.331f, -26.396f, 11.537f, -38.05f, 18.585f)
                arcToRelative(12.138f, 12.138f, 0.0f, false, true, -6.28f, 1.777f)
                lineTo(54.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(340.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(340.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                verticalLineToRelative(-25.966f)
                curveToRelative(0.0f, -5.37f, 3.579f, -10.059f, 8.74f, -11.541f)
                close()
            }
        }
        .build()
        return _shareSquare!!
    }

private var _shareSquare: ImageVector? = null
