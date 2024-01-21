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

public val SimpleIcons.Transifex: ImageVector
    get() {
        if (_transifex != null) {
            return _transifex!!
        }
        _transifex = Builder(name = "Transifex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.073f, 12.851f)
                lineToRelative(-2.758f, -2.757f)
                lineToRelative(3.722f, -3.659f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, true, 0.467f, 0.003f)
                lineToRelative(2.27f, 2.309f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, true, -0.004f, 0.468f)
                close()
                moveTo(20.073f, 12.851f)
                horizontalLineToRelative(-0.001f)
                close()
                moveTo(11.033f, 6.418f)
                lineTo(23.903f, 19.287f)
                curveToRelative(0.129f, 0.13f, 0.129f, 0.34f, 0.0f, 0.469f)
                lineToRelative(-2.289f, 2.289f)
                arcToRelative(0.331f, 0.331f, 0.0f, false, true, -0.468f, 0.0f)
                lineToRelative(-5.168f, -5.168f)
                lineToRelative(-2.863f, 2.815f)
                curveToRelative(-0.604f, 0.593f, -1.244f, 1.159f, -1.975f, 1.591f)
                arcToRelative(7.037f, 7.037f, 0.0f, false, true, -2.248f, 0.83f)
                curveToRelative(-2.191f, 0.42f, -4.557f, -0.047f, -6.303f, -1.468f)
                arcTo(7.065f, 7.065f, 0.0f, false, true, 0.0f, 15.207f)
                lineTo(0.0f, 2.069f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, true, 0.331f, -0.33f)
                horizontalLineToRelative(3.237f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, true, 0.331f, 0.33f)
                verticalLineToRelative(4.125f)
                lineTo(6.65f, 6.194f)
                curveToRelative(0.178f, 0.0f, 0.323f, 0.145f, 0.323f, 0.323f)
                verticalLineToRelative(3.617f)
                arcToRelative(0.323f, 0.323f, 0.0f, false, true, -0.323f, 0.323f)
                lineTo(3.899f, 10.457f)
                verticalLineToRelative(4.75f)
                curveToRelative(0.0f, 1.272f, 0.808f, 2.429f, 1.988f, 2.893f)
                curveToRelative(0.753f, 0.295f, 1.617f, 0.321f, 2.397f, 0.131f)
                curveToRelative(0.852f, -0.206f, 1.484f, -0.717f, 2.097f, -1.319f)
                lineToRelative(2.839f, -2.792f)
                lineToRelative(-4.945f, -4.945f)
                arcToRelative(0.331f, 0.331f, 0.0f, false, true, 0.0f, -0.468f)
                lineToRelative(2.289f, -2.289f)
                arcToRelative(0.333f, 0.333f, 0.0f, false, true, 0.469f, 0.0f)
            }
        }
        .build()
        return _transifex!!
    }

private var _transifex: ImageVector? = null
