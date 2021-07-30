package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Octave: ImageVector
    get() {
        if (_octave != null) {
            return _octave!!
        }
        _octave = Builder(name = "Octave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 0.007f)
                curveToRelative(-2.414f, -0.09f, -4.658f, 0.715f, -6.286f, 2.485f)
                curveTo(2.913f, 3.906f, 2.188f, 5.75f, 1.987f, 7.77f)
                horizontalLineToRelative(-0.42f)
                curveTo(0.703f, 7.77f, 0.0f, 8.473f, 0.0f, 9.335f)
                verticalLineToRelative(4.743f)
                curveToRelative(0.0f, 0.863f, 0.702f, 1.567f, 1.565f, 1.567f)
                horizontalLineToRelative(2.091f)
                arcToRelative(16.899f, 16.899f, 0.0f, false, false, 2.57f, 3.687f)
                curveToRelative(4.46f, 4.848f, 10.696f, 6.036f, 14.561f, 3.016f)
                horizontalLineToRelative(2.102f)
                curveToRelative(0.577f, 0.0f, 1.05f, -0.473f, 1.05f, -1.05f)
                lineTo(23.939f, 18.43f)
                arcToRelative(1.03f, 1.03f, 0.0f, false, false, -0.257f, -0.668f)
                curveToRelative(0.858f, -3.433f, -0.045f, -7.642f, -2.52f, -11.219f)
                curveToRelative(0.002f, -0.017f, 0.01f, -0.032f, 0.01f, -0.049f)
                lineTo(21.172f, 4.482f)
                arcToRelative(0.822f, 0.822f, 0.0f, false, false, -0.816f, -0.819f)
                horizontalLineToRelative(-1.703f)
                curveTo(16.142f, 1.372f, 13.218f, 0.11f, 10.5f, 0.007f)
                close()
                moveTo(12.25f, 2.187f)
                curveToRelative(1.78f, -0.01f, 3.69f, 0.62f, 5.425f, 1.85f)
                arcToRelative(0.797f, 0.797f, 0.0f, false, false, -0.15f, 0.445f)
                verticalLineToRelative(2.013f)
                curveToRelative(0.0f, 0.449f, 0.368f, 0.82f, 0.816f, 0.82f)
                horizontalLineToRelative(2.016f)
                arcToRelative(0.788f, 0.788f, 0.0f, false, false, 0.392f, -0.116f)
                curveToRelative(2.248f, 3.302f, 2.735f, 7.322f, 1.24f, 10.18f)
                horizontalLineToRelative(-1.964f)
                curveToRelative(-0.579f, 0.0f, -1.052f, 0.475f, -1.052f, 1.051f)
                verticalLineToRelative(1.794f)
                curveToRelative(-2.991f, 1.3f, -7.005f, 0.222f, -9.964f, -2.992f)
                arcToRelative(12.743f, 12.743f, 0.0f, false, true, -1.55f, -2.098f)
                curveToRelative(0.256f, -0.279f, 0.416f, -0.647f, 0.416f, -1.056f)
                lineTo(7.875f, 9.335f)
                curveToRelative(0.0f, -0.862f, -0.702f, -1.565f, -1.565f, -1.565f)
                lineTo(5.9f, 7.77f)
                curveToRelative(0.238f, -1.364f, 0.781f, -2.612f, 1.688f, -3.596f)
                curveToRelative(1.225f, -1.331f, 2.88f, -1.98f, 4.661f, -1.988f)
                close()
                moveTo(18.341f, 4.197f)
                horizontalLineToRelative(2.016f)
                curveToRelative(0.162f, 0.0f, 0.283f, 0.123f, 0.283f, 0.285f)
                verticalLineToRelative(2.013f)
                curveToRelative(0.0f, 0.163f, -0.12f, 0.285f, -0.283f, 0.285f)
                lineTo(18.34f, 6.78f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.285f, -0.285f)
                lineTo(18.055f, 4.482f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.285f, -0.285f)
                close()
                moveTo(1.566f, 8.303f)
                horizontalLineToRelative(4.743f)
                curveToRelative(0.578f, 0.0f, 1.033f, 0.456f, 1.033f, 1.032f)
                verticalLineToRelative(4.743f)
                curveToRelative(0.0f, 0.577f, -0.455f, 1.033f, -1.032f, 1.033f)
                lineTo(1.567f, 15.111f)
                arcToRelative(1.024f, 1.024f, 0.0f, false, true, -1.034f, -1.032f)
                lineTo(0.533f, 9.335f)
                curveToRelative(0.0f, -0.576f, 0.455f, -1.032f, 1.032f, -1.032f)
                close()
                moveTo(20.025f, 17.913f)
                horizontalLineToRelative(2.865f)
                curveToRelative(0.29f, 0.0f, 0.52f, 0.226f, 0.52f, 0.518f)
                verticalLineToRelative(2.865f)
                arcToRelative(0.512f, 0.512f, 0.0f, false, true, -0.52f, 0.519f)
                horizontalLineToRelative(-2.865f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, -0.519f, -0.519f)
                verticalLineToRelative(-2.864f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, 0.519f, -0.518f)
                close()
            }
        }
        .build()
        return _octave!!
    }

private var _octave: ImageVector? = null
