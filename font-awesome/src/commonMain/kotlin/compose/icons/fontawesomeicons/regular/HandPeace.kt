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

public val RegularGroup.HandPeace: ImageVector
    get() {
        if (_handPeace != null) {
            return _handPeace!!
        }
        _handPeace = Builder(name = "HandPeace", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(362.15f, 191.98f)
                curveToRelative(-13.71f, -21.65f, -38.76f, -34.02f, -65.01f, -30.34f)
                verticalLineTo(74.0f)
                curveToRelative(0.0f, -40.8f, -32.81f, -74.0f, -73.14f, -74.0f)
                curveToRelative(-40.33f, 0.0f, -73.14f, 33.2f, -73.14f, 74.0f)
                lineTo(160.0f, 168.0f)
                lineToRelative(-18.68f, -78.85f)
                curveTo(126.58f, 50.84f, 83.85f, 32.11f, 46.21f, 47.21f)
                curveTo(8.73f, 62.24f, -9.57f, 104.96f, 5.01f, 142.85f)
                lineToRelative(55.76f, 144.93f)
                curveToRelative(-30.56f, 24.96f, -43.99f, 57.81f, -24.73f, 92.22f)
                lineToRelative(54.85f, 98.0f)
                curveTo(102.63f, 498.97f, 124.73f, 512.0f, 148.57f, 512.0f)
                horizontalLineToRelative(205.7f)
                curveToRelative(30.74f, 0.0f, 57.56f, -21.44f, 64.56f, -51.8f)
                lineToRelative(27.43f, -119.0f)
                arcToRelative(67.8f, 67.8f, 0.0f, false, false, 1.73f, -15.2f)
                lineTo(448.0f, 256.0f)
                curveToRelative(0.0f, -44.96f, -43.26f, -77.34f, -85.85f, -64.02f)
                close()
                moveTo(399.99f, 326.0f)
                curveToRelative(0.0f, 1.49f, -0.17f, 2.98f, -0.5f, 4.42f)
                lineToRelative(-27.43f, 119.0f)
                curveToRelative(-1.98f, 8.58f, -9.29f, 14.58f, -17.78f, 14.58f)
                horizontalLineTo(148.57f)
                curveToRelative(-6.49f, 0.0f, -12.54f, -3.62f, -15.81f, -9.45f)
                lineToRelative(-54.85f, -98.0f)
                curveToRelative(-4.56f, -8.14f, -2.62f, -18.67f, 4.51f, -24.49f)
                lineToRelative(26.65f, -21.76f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 4.81f, -18.14f)
                lineToRelative(-64.09f, -166.55f)
                curveTo(37.23f, 92.96f, 84.37f, 74.84f, 96.51f, 106.39f)
                lineToRelative(59.78f, 155.36f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 171.23f, 272.0f)
                horizontalLineToRelative(11.63f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineTo(74.0f)
                curveToRelative(0.0f, -34.38f, 50.28f, -34.43f, 50.28f, 0.0f)
                verticalLineToRelative(182.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(6.86f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-28.0f)
                curveToRelative(0.0f, -25.12f, 36.57f, -25.16f, 36.57f, 0.0f)
                verticalLineToRelative(28.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(6.86f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                curveToRelative(0.0f, -25.12f, 36.57f, -25.16f, 36.57f, 0.0f)
                verticalLineToRelative(70.0f)
                close()
            }
        }
        .build()
        return _handPeace!!
    }

private var _handPeace: ImageVector? = null
