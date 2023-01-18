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

public val IonIcons.LogoBitbucket: ImageVector
    get() {
        if (_logoBitbucket != null) {
            return _logoBitbucket!!
        }
        _logoBitbucket = Builder(name = "LogoBitbucket", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(483.13f, 32.23f)
                arcToRelative(19.65f, 19.65f, 0.0f, false, false, -2.54f, -0.23f)
                horizontalLineToRelative(-449.0f)
                curveTo(23.0f, 31.88f, 16.12f, 38.88f, 16.0f, 47.75f)
                arcToRelative(11.44f, 11.44f, 0.0f, false, false, 0.23f, 2.8f)
                lineTo(81.53f, 461.8f)
                arcToRelative(22.52f, 22.52f, 0.0f, false, false, 7.0f, 12.95f)
                horizontalLineToRelative(0.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 102.0f, 480.0f)
                horizontalLineTo(415.18f)
                arcToRelative(15.45f, 15.45f, 0.0f, false, false, 15.34f, -13.42f)
                lineTo(469.4f, 218.67f)
                horizontalLineTo(325.19f)
                lineToRelative(-18.46f, 112.0f)
                horizontalLineTo(205.21f)
                lineToRelative(-25.73f, -148.0f)
                horizontalLineTo(475.06f)
                lineToRelative(20.76f, -132.0f)
                curveTo(497.09f, 41.92f, 491.44f, 33.63f, 483.13f, 32.23f)
                close()
            }
        }
        .build()
        return _logoBitbucket!!
    }

private var _logoBitbucket: ImageVector? = null
