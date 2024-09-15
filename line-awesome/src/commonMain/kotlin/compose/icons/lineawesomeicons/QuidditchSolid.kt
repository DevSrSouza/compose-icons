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

public val LineAwesomeIcons.QuidditchSolid: ImageVector
    get() {
        if (_quidditchSolid != null) {
            return _quidditchSolid!!
        }
        _quidditchSolid = Builder(name = "QuidditchSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.402f, 5.203f)
                lineTo(17.84f, 13.119f)
                lineTo(17.41f, 12.547f)
                lineTo(17.406f, 12.547f)
                lineTo(16.361f, 11.16f)
                lineTo(14.764f, 12.363f)
                lineTo(15.158f, 12.887f)
                lineTo(10.615f, 13.57f)
                curveTo(8.57f, 13.895f, 6.76f, 14.988f, 5.518f, 16.645f)
                lineTo(3.0f, 20.0f)
                lineTo(4.691f, 20.0f)
                curveTo(3.527f, 21.447f, 2.685f, 23.135f, 2.232f, 24.949f)
                lineTo(1.721f, 27.0f)
                lineTo(8.844f, 27.0f)
                curveTo(12.347f, 27.0f, 15.504f, 24.788f, 16.697f, 21.51f)
                lineTo(18.361f, 17.137f)
                lineTo(18.719f, 17.611f)
                lineTo(20.314f, 16.408f)
                lineTo(19.041f, 14.717f)
                lineTo(29.602f, 6.803f)
                lineTo(28.402f, 5.203f)
                close()
                moveTo(16.525f, 14.701f)
                lineTo(16.938f, 15.25f)
                lineTo(14.822f, 20.813f)
                curveTo(13.91f, 23.317f, 11.509f, 25.0f, 8.844f, 25.0f)
                lineTo(4.289f, 25.0f)
                curveTo(4.803f, 23.257f, 5.746f, 21.667f, 7.033f, 20.381f)
                lineTo(9.412f, 18.0f)
                lineTo(7.0f, 18.0f)
                lineTo(7.115f, 17.844f)
                curveTo(8.045f, 16.605f, 9.401f, 15.789f, 10.922f, 15.547f)
                lineTo(16.525f, 14.701f)
                close()
                moveTo(23.5f, 20.0f)
                curveTo(21.57f, 20.0f, 20.0f, 21.57f, 20.0f, 23.5f)
                curveTo(20.0f, 25.43f, 21.57f, 27.0f, 23.5f, 27.0f)
                curveTo(25.43f, 27.0f, 27.0f, 25.43f, 27.0f, 23.5f)
                curveTo(27.0f, 21.57f, 25.43f, 20.0f, 23.5f, 20.0f)
                close()
                moveTo(23.5f, 22.0f)
                curveTo(24.327f, 22.0f, 25.0f, 22.673f, 25.0f, 23.5f)
                curveTo(25.0f, 24.327f, 24.327f, 25.0f, 23.5f, 25.0f)
                curveTo(22.673f, 25.0f, 22.0f, 24.327f, 22.0f, 23.5f)
                curveTo(22.0f, 22.673f, 22.673f, 22.0f, 23.5f, 22.0f)
                close()
            }
        }
        .build()
        return _quidditchSolid!!
    }

private var _quidditchSolid: ImageVector? = null
