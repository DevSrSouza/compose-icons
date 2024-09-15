package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.JointSolid: ImageVector
    get() {
        if (_jointSolid != null) {
            return _jointSolid!!
        }
        _jointSolid = Builder(name = "JointSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.906f, 3.992f)
                curveTo(14.545f, 4.353f, 14.282f, 4.792f, 13.971f, 5.475f)
                curveTo(13.659f, 6.157f, 13.378f, 7.018f, 13.375f, 7.973f)
                curveTo(13.372f, 8.928f, 13.702f, 10.007f, 14.563f, 10.83f)
                curveTo(15.423f, 11.653f, 16.72f, 12.196f, 18.549f, 12.43f)
                curveTo(20.074f, 12.624f, 21.071f, 12.894f, 21.629f, 13.229f)
                curveTo(22.187f, 13.563f, 22.419f, 13.898f, 22.6f, 14.717f)
                lineTo(24.553f, 14.285f)
                curveTo(24.293f, 13.105f, 23.653f, 12.11f, 22.658f, 11.514f)
                curveTo(21.664f, 10.917f, 20.43f, 10.653f, 18.803f, 10.445f)
                curveTo(17.245f, 10.247f, 16.39f, 9.81f, 15.945f, 9.385f)
                curveTo(15.501f, 8.959f, 15.373f, 8.523f, 15.375f, 7.979f)
                curveTo(15.377f, 7.434f, 15.561f, 6.808f, 15.791f, 6.305f)
                curveTo(16.021f, 5.801f, 16.375f, 5.351f, 16.32f, 5.406f)
                lineTo(14.906f, 3.992f)
                close()
                moveTo(20.43f, 4.313f)
                lineTo(20.43f, 6.313f)
                curveTo(21.051f, 6.313f, 21.873f, 6.389f, 22.482f, 6.734f)
                curveTo(23.092f, 7.08f, 23.597f, 7.608f, 23.721f, 9.07f)
                lineTo(23.797f, 9.986f)
                lineTo(24.717f, 9.986f)
                curveTo(25.233f, 9.986f, 26.314f, 10.153f, 26.848f, 10.619f)
                curveTo(27.114f, 10.852f, 27.295f, 11.121f, 27.357f, 11.645f)
                curveTo(27.42f, 12.168f, 27.326f, 12.973f, 26.855f, 14.119f)
                lineTo(28.705f, 14.881f)
                curveTo(29.263f, 13.523f, 29.461f, 12.388f, 29.344f, 11.408f)
                curveTo(29.227f, 10.429f, 28.757f, 9.633f, 28.162f, 9.113f)
                curveTo(27.252f, 8.318f, 26.258f, 8.136f, 25.453f, 8.068f)
                curveTo(25.107f, 6.623f, 24.4f, 5.522f, 23.469f, 4.994f)
                curveTo(22.347f, 4.359f, 21.172f, 4.313f, 20.43f, 4.313f)
                close()
                moveTo(30.0f, 16.0f)
                lineTo(2.0f, 17.0f)
                lineTo(2.0f, 23.0f)
                lineTo(30.0f, 24.0f)
                lineTo(30.0f, 16.0f)
                close()
                moveTo(28.0f, 18.072f)
                lineTo(28.0f, 21.928f)
                lineTo(26.0f, 21.855f)
                lineTo(26.0f, 18.145f)
                lineTo(28.0f, 18.072f)
                close()
                moveTo(24.0f, 18.215f)
                lineTo(24.0f, 21.785f)
                lineTo(22.0f, 21.713f)
                lineTo(22.0f, 18.287f)
                lineTo(24.0f, 18.215f)
                close()
                moveTo(20.0f, 18.357f)
                lineTo(20.0f, 21.643f)
                lineTo(4.0f, 21.07f)
                lineTo(4.0f, 18.93f)
                lineTo(20.0f, 18.357f)
                close()
            }
        }
        .build()
        return _jointSolid!!
    }

private var _jointSolid: ImageVector? = null
