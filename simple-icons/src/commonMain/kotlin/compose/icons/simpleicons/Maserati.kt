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

public val SimpleIcons.Maserati: ImageVector
    get() {
        if (_maserati != null) {
            return _maserati!!
        }
        _maserati = Builder(name = "Maserati", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.678f, 21.213f)
                horizontalLineToRelative(4.67f)
                verticalLineToRelative(0.909f)
                horizontalLineToRelative(-4.67f)
                verticalLineToRelative(-0.909f)
                close()
                moveTo(10.548f, 24.0f)
                horizontalLineToRelative(2.93f)
                verticalLineToRelative(-1.409f)
                horizontalLineToRelative(-2.93f)
                lineTo(10.548f, 24.0f)
                close()
                moveTo(9.704f, 18.687f)
                curveToRelative(0.575f, 0.523f, 0.881f, 1.28f, 0.83f, 2.056f)
                horizontalLineToRelative(2.944f)
                arcToRelative(2.575f, 2.575f, 0.0f, false, true, 0.818f, -2.056f)
                lineTo(9.704f, 18.687f)
                close()
                moveTo(6.652f, 16.517f)
                verticalLineToRelative(0.683f)
                horizontalLineToRelative(10.696f)
                verticalLineToRelative(-0.683f)
                lineTo(6.652f, 16.517f)
                close()
                moveTo(7.13f, 19.604f)
                arcToRelative(3.833f, 3.833f, 0.0f, false, false, 1.74f, -0.917f)
                lineTo(7.009f, 18.687f)
                lineToRelative(0.121f, 0.917f)
                close()
                moveTo(16.87f, 19.604f)
                lineToRelative(0.121f, -0.917f)
                horizontalLineToRelative(-1.86f)
                curveToRelative(0.49f, 0.451f, 1.089f, 0.768f, 1.739f, 0.917f)
                close()
                moveTo(8.204f, 15.048f)
                arcTo(73.645f, 73.645f, 0.0f, false, false, 5.913f, 8.63f)
                curveToRelative(0.644f, 0.102f, 1.283f, 0.237f, 1.913f, 0.405f)
                arcTo(18.885f, 18.885f, 0.0f, false, false, 3.51f, 5.583f)
                curveToRelative(1.226f, 2.378f, 2.378f, 5.987f, 2.965f, 9.465f)
                horizontalLineToRelative(1.73f)
                close()
                moveTo(17.53f, 15.048f)
                curveToRelative(0.587f, -3.478f, 1.74f, -7.087f, 2.961f, -9.465f)
                arcToRelative(18.877f, 18.877f, 0.0f, false, false, -4.308f, 3.452f)
                curveToRelative(0.63f, -0.169f, 1.268f, -0.304f, 1.913f, -0.405f)
                arcToRelative(65.966f, 65.966f, 0.0f, false, false, -2.292f, 6.418f)
                horizontalLineToRelative(1.726f)
                close()
                moveTo(6.087f, 16.17f)
                horizontalLineToRelative(11.83f)
                verticalLineToRelative(-0.679f)
                lineTo(6.087f, 15.491f)
                verticalLineToRelative(0.679f)
                close()
                moveTo(11.222f, 15.026f)
                curveToRelative(0.312f, -0.74f, 0.569f, -1.5f, 0.77f, -2.278f)
                curveToRelative(0.203f, 0.777f, 0.462f, 1.538f, 0.773f, 2.278f)
                horizontalLineToRelative(2.052f)
                curveToRelative(-1.743f, -2.87f, -2.234f, -6.665f, -2.343f, -10.0f)
                curveToRelative(-0.009f, -0.343f, 0.13f, -0.43f, 0.46f, -0.283f)
                lineToRelative(1.053f, 0.474f)
                arcTo(15.501f, 15.501f, 0.0f, false, true, 11.991f, 0.0f)
                arcTo(15.494f, 15.494f, 0.0f, false, true, 10.0f, 5.217f)
                lineToRelative(1.052f, -0.474f)
                curveToRelative(0.33f, -0.152f, 0.457f, -0.06f, 0.457f, 0.283f)
                curveToRelative(-0.109f, 3.313f, -0.6f, 7.109f, -2.34f, 10.0f)
                horizontalLineToRelative(2.053f)
                close()
                moveTo(6.087f, 18.217f)
                horizontalLineToRelative(11.83f)
                verticalLineToRelative(-0.678f)
                lineTo(6.087f, 17.539f)
                verticalLineToRelative(0.678f)
                close()
            }
        }
        .build()
        return _maserati!!
    }

private var _maserati: ImageVector? = null
