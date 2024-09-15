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

public val RegularGroup.HandRock: ImageVector
    get() {
        if (_handRock != null) {
            return _handRock!!
        }
        _handRock = Builder(name = "HandRock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.86f, 79.05f)
                curveToRelative(-22.4f, -33.9f, -66.11f, -42.27f, -98.81f, -23.59f)
                curveToRelative(-29.47f, -31.47f, -79.14f, -31.09f, -108.33f, -0.02f)
                curveToRelative(-47.16f, -27.02f, -108.71f, 5.05f, -110.67f, 60.81f)
                curveTo(44.85f, 105.41f, 0.0f, 140.0f, 0.0f, 187.43f)
                verticalLineToRelative(56.95f)
                curveToRelative(0.0f, 32.74f, 14.28f, 63.95f, 39.18f, 85.63f)
                lineToRelative(97.71f, 85.08f)
                curveToRelative(4.25f, 3.7f, 3.11f, 5.57f, 3.11f, 32.9f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(252.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                curveToRelative(0.0f, -23.51f, -1.01f, -30.75f, 3.98f, -42.37f)
                lineToRelative(42.83f, -99.66f)
                curveToRelative(6.09f, -14.18f, 9.18f, -29.17f, 9.18f, -44.57f)
                verticalLineTo(146.96f)
                curveToRelative(0.0f, -52.84f, -54.31f, -88.66f, -103.14f, -67.91f)
                close()
                moveTo(464.0f, 261.41f)
                arcToRelative(64.5f, 64.5f, 0.0f, false, true, -5.28f, 25.61f)
                lineToRelative(-42.83f, 99.65f)
                curveToRelative(-5.23f, 12.17f, -7.88f, 25.04f, -7.88f, 38.25f)
                verticalLineTo(432.0f)
                horizontalLineTo(188.0f)
                verticalLineToRelative(-10.29f)
                curveToRelative(0.0f, -16.37f, -7.14f, -31.98f, -19.59f, -42.82f)
                lineToRelative(-97.71f, -85.08f)
                curveTo(56.27f, 281.26f, 48.0f, 263.24f, 48.0f, 244.38f)
                verticalLineToRelative(-56.95f)
                curveToRelative(0.0f, -33.21f, 52.0f, -33.54f, 52.0f, 0.68f)
                verticalLineToRelative(41.23f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 5.49f, 12.07f)
                lineToRelative(7.0f, 6.09f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 139.0f, 235.43f)
                verticalLineTo(118.86f)
                curveToRelative(0.0f, -33.1f, 52.0f, -33.72f, 52.0f, 0.68f)
                verticalLineToRelative(26.75f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-41.14f)
                curveToRelative(0.0f, -33.13f, 52.0f, -33.67f, 52.0f, 0.68f)
                verticalLineToRelative(40.47f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-27.43f)
                curveToRelative(0.0f, -33.03f, 52.0f, -33.78f, 52.0f, 0.68f)
                verticalLineToRelative(26.75f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                curveToRelative(0.0f, -33.15f, 52.0f, -33.61f, 52.0f, 0.68f)
                verticalLineToRelative(114.44f)
                close()
            }
        }
        .build()
        return _handRock!!
    }

private var _handRock: ImageVector? = null
