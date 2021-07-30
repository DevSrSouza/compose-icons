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

public val SimpleIcons.HiveBlockchain: ImageVector
    get() {
        if (_hiveBlockchain != null) {
            return _hiveBlockchain!!
        }
        _hiveBlockchain = Builder(name = "HiveBlockchain", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.076f, 1.637f)
                arcToRelative(0.103f, 0.103f, 0.0f, false, false, -0.09f, 0.05f)
                lineTo(0.014f, 11.95f)
                arcToRelative(0.102f, 0.102f, 0.0f, false, false, 0.0f, 0.104f)
                lineToRelative(6.039f, 10.26f)
                curveToRelative(0.04f, 0.068f, 0.14f, 0.068f, 0.18f, 0.0f)
                lineToRelative(5.972f, -10.262f)
                arcToRelative(0.102f, 0.102f, 0.0f, false, false, -0.002f, -0.104f)
                lineTo(6.166f, 1.687f)
                arcToRelative(0.103f, 0.103f, 0.0f, false, false, -0.09f, -0.05f)
                close()
                moveTo(8.939f, 1.637f)
                curveToRelative(-0.079f, 0.0f, -0.13f, 0.085f, -0.09f, 0.154f)
                lineToRelative(5.186f, 8.967f)
                arcToRelative(0.105f, 0.105f, 0.0f, false, false, 0.09f, 0.053f)
                horizontalLineToRelative(3.117f)
                curveToRelative(0.08f, 0.0f, 0.13f, -0.088f, 0.09f, -0.157f)
                lineToRelative(-5.186f, -8.966f)
                arcToRelative(0.104f, 0.104f, 0.0f, false, false, -0.09f, -0.051f)
                lineTo(8.94f, 1.637f)
                close()
                moveTo(14.83f, 1.637f)
                arcToRelative(0.102f, 0.102f, 0.0f, false, false, -0.088f, 0.154f)
                lineTo(20.656f, 12.0f)
                lineToRelative(-5.914f, 10.209f)
                arcToRelative(0.102f, 0.102f, 0.0f, false, false, 0.088f, 0.154f)
                horizontalLineToRelative(3.123f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, 0.088f, -0.05f)
                lineToRelative(5.945f, -10.262f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, 0.0f, -0.102f)
                lineTo(18.041f, 1.688f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.088f, -0.051f)
                lineTo(14.83f, 1.637f)
                close()
                moveTo(14.04f, 13.337f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.089f, 0.052f)
                lineToRelative(-5.101f, 8.82f)
                curveToRelative(-0.04f, 0.069f, 0.01f, 0.154f, 0.09f, 0.154f)
                horizontalLineToRelative(3.117f)
                arcToRelative(0.104f, 0.104f, 0.0f, false, false, 0.09f, -0.05f)
                lineToRelative(5.1f, -8.82f)
                arcToRelative(0.103f, 0.103f, 0.0f, false, false, -0.09f, -0.155f)
                horizontalLineToRelative(-3.118f)
                close()
            }
        }
        .build()
        return _hiveBlockchain!!
    }

private var _hiveBlockchain: ImageVector? = null
