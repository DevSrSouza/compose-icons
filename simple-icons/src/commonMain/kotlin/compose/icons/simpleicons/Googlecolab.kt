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

public val SimpleIcons.Googlecolab: ImageVector
    get() {
        if (_googlecolab != null) {
            return _googlecolab!!
        }
        _googlecolab = Builder(name = "Googlecolab", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9414f, 4.9757f)
                arcToRelative(7.033f, 7.033f, 0.0f, false, false, -4.9308f, 2.0646f)
                arcToRelative(7.033f, 7.033f, 0.0f, false, false, -0.1232f, 9.8068f)
                lineToRelative(2.395f, -2.395f)
                arcToRelative(3.6455f, 3.6455f, 0.0f, false, true, 5.1497f, -5.1478f)
                lineToRelative(2.397f, -2.3989f)
                arcToRelative(7.033f, 7.033f, 0.0f, false, false, -4.8877f, -1.9297f)
                close()
                moveTo(7.07f, 4.9855f)
                arcToRelative(7.033f, 7.033f, 0.0f, false, false, -4.8878f, 1.9316f)
                lineToRelative(2.3911f, 2.3911f)
                arcToRelative(3.6434f, 3.6434f, 0.0f, false, true, 5.0227f, 0.1271f)
                lineToRelative(1.7341f, -2.9737f)
                lineToRelative(-0.0997f, -0.0802f)
                arcTo(7.033f, 7.033f, 0.0f, false, false, 7.07f, 4.9855f)
                close()
                moveTo(22.0793f, 7.1576f)
                lineToRelative(-2.3892f, 2.3911f)
                arcToRelative(3.6455f, 3.6455f, 0.0f, false, true, -5.1497f, 5.1497f)
                lineToRelative(-2.4067f, 2.4068f)
                arcToRelative(7.0362f, 7.0362f, 0.0f, false, false, 9.9456f, -9.9476f)
                close()
                moveTo(1.932f, 7.1674f)
                arcToRelative(7.033f, 7.033f, 0.0f, false, false, -0.002f, 9.6816f)
                lineToRelative(2.397f, -2.397f)
                arcToRelative(3.6434f, 3.6434f, 0.0f, false, true, -0.004f, -4.8916f)
                close()
                moveTo(9.596f, 14.5909f)
                curveToRelative(-1.38f, 1.3816f, -3.5863f, 1.411f, -5.0168f, 0.1134f)
                lineToRelative(-2.397f, 2.395f)
                curveToRelative(2.4693f, 2.3328f, 6.263f, 2.5753f, 9.0072f, 0.5455f)
                lineToRelative(0.1368f, -0.1115f)
                close()
            }
        }
        .build()
        return _googlecolab!!
    }

private var _googlecolab: ImageVector? = null
