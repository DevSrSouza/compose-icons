package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PlaySkipBack: ImageVector
    get() {
        if (_playSkipBack != null) {
            return _playSkipBack!!
        }
        _playSkipBack = Builder(name = "PlaySkipBack", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineTo(216.43f)
                lineTo(360.77f, 77.11f)
                arcToRelative(35.13f, 35.13f, 0.0f, false, true, 35.77f, -0.44f)
                curveToRelative(12.0f, 6.8f, 19.46f, 20.0f, 19.46f, 34.33f)
                verticalLineTo(401.0f)
                curveToRelative(0.0f, 14.37f, -7.46f, 27.53f, -19.46f, 34.33f)
                arcToRelative(35.14f, 35.14f, 0.0f, false, true, -35.77f, -0.45f)
                lineTo(128.0f, 295.57f)
                verticalLineTo(432.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                verticalLineTo(80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 64.0f)
                close()
            }
        }
        .build()
        return _playSkipBack!!
    }

private var _playSkipBack: ImageVector? = null
