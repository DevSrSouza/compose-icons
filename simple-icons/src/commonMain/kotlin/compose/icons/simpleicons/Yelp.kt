package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Yelp: ImageVector
    get() {
        if (_yelp != null) {
            return _yelp!!
        }
        _yelp = Builder(name = "Yelp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.16f, 12.594f)
                lineToRelative(-4.995f, 1.433f)
                curveToRelative(-0.96f, 0.276f, -1.74f, -0.8f, -1.176f, -1.63f)
                lineToRelative(2.905f, -4.308f)
                arcToRelative(1.072f, 1.072f, 0.0f, false, true, 1.596f, -0.206f)
                arcToRelative(9.194f, 9.194f, 0.0f, false, true, 2.364f, 3.252f)
                arcToRelative(1.073f, 1.073f, 0.0f, false, true, -0.686f, 1.459f)
                close()
                moveTo(15.135f, 15.746f)
                lineToRelative(4.942f, 1.606f)
                arcToRelative(1.072f, 1.072f, 0.0f, false, true, 0.636f, 1.48f)
                arcToRelative(9.316f, 9.316f, 0.0f, false, true, -2.47f, 3.169f)
                arcToRelative(1.073f, 1.073f, 0.0f, false, true, -1.592f, -0.26f)
                lineToRelative(-2.76f, -4.409f)
                curveToRelative(-0.528f, -0.847f, 0.288f, -1.894f, 1.236f, -1.584f)
                close()
                moveTo(10.339f, 11.378f)
                lineTo(5.454f, 2.916f)
                arcToRelative(1.072f, 1.072f, 0.0f, false, true, 0.466f, -1.5f)
                arcTo(14.973f, 14.973f, 0.0f, false, true, 11.184f, 0.003f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, true, 1.153f, 1.068f)
                verticalLineToRelative(9.768f)
                curveToRelative(0.0f, 1.096f, -1.45f, 1.483f, -1.998f, 0.535f)
                close()
                moveTo(9.482f, 15.548f)
                lineTo(4.44f, 16.806f)
                arcToRelative(1.073f, 1.073f, 0.0f, false, true, -1.324f, -0.92f)
                arcToRelative(9.218f, 9.218f, 0.0f, false, true, 0.43f, -3.997f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, true, 1.485f, -0.62f)
                lineToRelative(4.668f, 2.279f)
                curveToRelative(0.9f, 0.438f, 0.763f, 1.76f, -0.207f, 2.0f)
                close()
                moveTo(10.368f, 17.025f)
                curveToRelative(0.669f, -0.744f, 1.901f, -0.246f, 1.866f, 0.752f)
                lineToRelative(-0.19f, 5.188f)
                arcToRelative(1.073f, 1.073f, 0.0f, false, true, -1.247f, 1.02f)
                arcToRelative(9.314f, 9.314f, 0.0f, false, true, -3.722f, -1.502f)
                arcToRelative(1.072f, 1.072f, 0.0f, false, true, -0.187f, -1.6f)
                lineToRelative(3.477f, -3.864f)
                close()
            }
        }
        .build()
        return _yelp!!
    }

private var _yelp: ImageVector? = null
