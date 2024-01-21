package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.MichelinBibGourmand: ImageVector
    get() {
        if (_michelinBibGourmand != null) {
            return _michelinBibGourmand!!
        }
        _michelinBibGourmand = Builder(name = "MichelinBibGourmand", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.97f, 20.0f)
                curveToRelative(-2.395f, -1.947f, -4.763f, -5.245f, -1.005f, -8.0f)
                curveToRelative(-0.52f, -4.0f, 3.442f, -7.5f, 5.524f, -7.5f)
                curveToRelative(0.347f, -1.0f, 1.499f, -1.5f, 2.54f, -1.5f)
                curveToRelative(1.04f, 0.0f, 2.135f, 0.5f, 2.482f, 1.5f)
                curveToRelative(2.082f, 0.0f, 6.044f, 3.5f, 5.524f, 7.5f)
                curveToRelative(3.758f, 2.755f, 1.39f, 6.053f, -1.005f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 11.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 2.0f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 2.0f, 0.0f, true, false, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 11.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 2.0f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 2.0f, 0.0f, true, false, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 17.085f)
                curveToRelative(3.5f, 2.712f, 6.5f, 2.712f, 9.0f, -1.085f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 18.5f)
                curveToRelative(0.815f, -2.337f, 1.881f, -1.472f, 2.0f, -0.55f)
            }
        }
        .build()
        return _michelinBibGourmand!!
    }

private var _michelinBibGourmand: ImageVector? = null
