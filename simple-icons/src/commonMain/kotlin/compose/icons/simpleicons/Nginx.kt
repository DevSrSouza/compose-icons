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

public val SimpleIcons.Nginx: ImageVector
    get() {
        if (_nginx != null) {
            return _nginx!!
        }
        _nginx = Builder(name = "Nginx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(1.605f, 6.0f)
                verticalLineToRelative(12.0f)
                lineTo(12.0f, 24.0f)
                lineToRelative(10.395f, -6.0f)
                lineTo(22.395f, 6.0f)
                lineTo(12.0f, 0.0f)
                close()
                moveTo(18.0f, 16.59f)
                curveToRelative(0.0f, 0.705f, -0.646f, 1.29f, -1.529f, 1.29f)
                curveToRelative(-0.631f, 0.0f, -1.351f, -0.255f, -1.801f, -0.81f)
                lineToRelative(-6.0f, -7.141f)
                verticalLineToRelative(6.66f)
                curveToRelative(0.0f, 0.721f, -0.57f, 1.29f, -1.274f, 1.29f)
                lineTo(7.32f, 17.879f)
                curveToRelative(-0.721f, 0.0f, -1.29f, -0.6f, -1.29f, -1.29f)
                lineTo(6.03f, 7.41f)
                curveToRelative(0.0f, -0.705f, 0.63f, -1.29f, 1.5f, -1.29f)
                curveToRelative(0.646f, 0.0f, 1.38f, 0.255f, 1.83f, 0.81f)
                lineToRelative(5.97f, 7.141f)
                lineTo(15.33f, 7.41f)
                curveToRelative(0.0f, -0.721f, 0.6f, -1.29f, 1.29f, -1.29f)
                horizontalLineToRelative(0.075f)
                curveToRelative(0.72f, 0.0f, 1.29f, 0.6f, 1.29f, 1.29f)
                verticalLineToRelative(9.18f)
                lineTo(18.0f, 16.59f)
                close()
            }
        }
        .build()
        return _nginx!!
    }

private var _nginx: ImageVector? = null
