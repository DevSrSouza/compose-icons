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

public val SimpleIcons.Bento: ImageVector
    get() {
        if (_bento != null) {
            return _bento!!
        }
        _bento = Builder(name = "Bento", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 10.435f)
                curveToRelative(0.0f, -0.256f, 0.051f, -0.512f, 0.153f, -0.758f)
                curveToRelative(0.233f, -0.56f, 0.854f, -1.046f, 2.095f, -2.018f)
                lineToRelative(6.206f, -4.856f)
                curveToRelative(1.241f, -0.972f, 1.862f, -1.458f, 2.577f, -1.64f)
                curveToRelative(0.63f, -0.16f, 1.308f, -0.16f, 1.938f, 0.0f)
                curveToRelative(0.715f, 0.183f, 1.336f, 0.668f, 2.577f, 1.64f)
                lineToRelative(6.206f, 4.856f)
                curveToRelative(1.241f, 0.972f, 1.862f, 1.458f, 2.095f, 2.018f)
                curveToRelative(0.102f, 0.246f, 0.153f, 0.502f, 0.153f, 0.758f)
                verticalLineToRelative(3.13f)
                curveToRelative(0.0f, 0.256f, -0.051f, 0.512f, -0.153f, 0.758f)
                curveToRelative(-0.233f, 0.56f, -0.854f, 1.046f, -2.095f, 2.017f)
                lineToRelative(-6.206f, 4.857f)
                curveToRelative(-1.241f, 0.972f, -1.862f, 1.457f, -2.577f, 1.64f)
                curveToRelative(-0.63f, 0.16f, -1.308f, 0.16f, -1.938f, 0.0f)
                curveToRelative(-0.715f, -0.183f, -1.336f, -0.668f, -2.577f, -1.64f)
                lineTo(2.248f, 16.34f)
                curveTo(1.007f, 15.37f, 0.386f, 14.883f, 0.153f, 14.323f)
                arcTo(1.971f, 1.971f, 0.0f, false, true, 0.0f, 13.565f)
                verticalLineToRelative(-3.13f)
                close()
                moveTo(9.34f, 7.197f)
                lineTo(10.227f, 7.891f)
                curveToRelative(0.62f, 0.485f, 0.93f, 0.728f, 1.289f, 0.82f)
                curveToRelative(0.315f, 0.08f, 0.653f, 0.08f, 0.968f, 0.0f)
                curveToRelative(0.358f, -0.092f, 0.668f, -0.335f, 1.29f, -0.82f)
                lineToRelative(0.886f, -0.694f)
                curveToRelative(0.62f, -0.486f, 0.93f, -0.729f, 1.047f, -1.009f)
                arcToRelative(0.975f, 0.975f, 0.0f, false, false, 0.0f, -0.758f)
                curveToRelative(-0.116f, -0.28f, -0.427f, -0.523f, -1.047f, -1.008f)
                lineToRelative(-0.887f, -0.694f)
                curveToRelative(-0.62f, -0.486f, -0.93f, -0.729f, -1.289f, -0.82f)
                arcToRelative(1.984f, 1.984f, 0.0f, false, false, -0.968f, 0.0f)
                curveToRelative(-0.358f, 0.091f, -0.668f, 0.334f, -1.29f, 0.82f)
                lineToRelative(-0.886f, 0.694f)
                curveToRelative(-0.62f, 0.485f, -0.93f, 0.728f, -1.047f, 1.008f)
                arcToRelative(0.975f, 0.975f, 0.0f, false, false, 0.0f, 0.758f)
                curveToRelative(0.116f, 0.28f, 0.427f, 0.523f, 1.047f, 1.009f)
                close()
                moveTo(15.25f, 11.822f)
                lineTo(16.137f, 12.516f)
                curveToRelative(0.62f, 0.486f, 0.931f, 0.729f, 1.29f, 0.82f)
                curveToRelative(0.314f, 0.08f, 0.653f, 0.08f, 0.968f, 0.0f)
                curveToRelative(0.358f, -0.091f, 0.668f, -0.334f, 1.288f, -0.82f)
                lineToRelative(0.887f, -0.694f)
                curveToRelative(0.62f, -0.485f, 0.931f, -0.728f, 1.047f, -1.008f)
                arcToRelative(0.976f, 0.976f, 0.0f, false, false, 0.0f, -0.758f)
                curveToRelative(-0.116f, -0.28f, -0.426f, -0.523f, -1.047f, -1.009f)
                lineToRelative(-0.887f, -0.694f)
                curveToRelative(-0.62f, -0.485f, -0.93f, -0.728f, -1.288f, -0.82f)
                arcToRelative(1.984f, 1.984f, 0.0f, false, false, -0.969f, 0.0f)
                curveToRelative(-0.358f, 0.092f, -0.668f, 0.335f, -1.289f, 0.82f)
                lineToRelative(-0.886f, 0.694f)
                curveToRelative(-0.621f, 0.486f, -0.931f, 0.729f, -1.047f, 1.009f)
                arcToRelative(0.975f, 0.975f, 0.0f, false, false, 0.0f, 0.758f)
                curveToRelative(0.116f, 0.28f, 0.426f, 0.523f, 1.047f, 1.008f)
                close()
                moveTo(3.43f, 11.822f)
                lineTo(10.227f, 17.142f)
                curveToRelative(0.62f, 0.486f, 0.93f, 0.728f, 1.289f, 0.82f)
                curveToRelative(0.315f, 0.08f, 0.653f, 0.08f, 0.968f, 0.0f)
                curveToRelative(0.358f, -0.092f, 0.668f, -0.334f, 1.29f, -0.82f)
                lineToRelative(0.886f, -0.694f)
                curveToRelative(0.62f, -0.486f, 0.93f, -0.729f, 1.047f, -1.009f)
                arcToRelative(0.974f, 0.974f, 0.0f, false, false, 0.0f, -0.758f)
                curveToRelative(-0.116f, -0.28f, -0.427f, -0.523f, -1.047f, -1.008f)
                lineToRelative(-6.797f, -5.32f)
                curveToRelative(-0.62f, -0.485f, -0.931f, -0.728f, -1.29f, -0.82f)
                arcToRelative(1.984f, 1.984f, 0.0f, false, false, -0.968f, 0.0f)
                curveToRelative(-0.358f, 0.092f, -0.668f, 0.335f, -1.288f, 0.82f)
                lineToRelative(-0.887f, 0.694f)
                curveToRelative(-0.62f, 0.486f, -0.931f, 0.729f, -1.047f, 1.009f)
                arcToRelative(0.975f, 0.975f, 0.0f, false, false, 0.0f, 0.758f)
                curveToRelative(0.116f, 0.28f, 0.426f, 0.523f, 1.047f, 1.008f)
                close()
            }
        }
        .build()
        return _bento!!
    }

private var _bento: ImageVector? = null
