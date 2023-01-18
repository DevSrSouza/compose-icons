package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) {
            return _twitterLogo!!
        }
        _twitterLogo = Builder(name = "TwitterLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.7f, 77.7f)
                lineToRelative(-30.2f, 30.1f)
                curveTo(209.5f, 177.7f, 150.5f, 232.0f, 80.0f, 232.0f)
                curveToRelative(-14.5f, 0.0f, -26.5f, -2.3f, -35.6f, -6.8f)
                curveToRelative(-7.3f, -3.7f, -10.3f, -7.6f, -11.1f, -8.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.9f, -11.9f)
                curveToRelative(0.2f, -0.1f, 23.8f, -9.1f, 39.1f, -26.4f)
                arcToRelative(108.6f, 108.6f, 0.0f, false, true, -24.7f, -24.4f)
                curveToRelative(-13.7f, -18.6f, -28.2f, -50.9f, -19.5f, -99.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 5.5f, -6.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.1f, 1.9f)
                curveToRelative(0.3f, 0.4f, 33.6f, 33.2f, 74.3f, 43.8f)
                verticalLineTo(88.0f)
                arcToRelative(48.3f, 48.3f, 0.0f, false, true, 48.6f, -48.0f)
                arcToRelative(48.2f, 48.2f, 0.0f, false, true, 41.0f, 24.0f)
                horizontalLineTo(240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.4f, 4.9f)
                arcTo(8.4f, 8.4f, 0.0f, false, true, 245.7f, 77.7f)
                close()
            }
        }
        .build()
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null
