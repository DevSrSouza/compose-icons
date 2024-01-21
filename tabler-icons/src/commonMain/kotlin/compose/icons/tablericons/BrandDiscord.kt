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

public val TablerIcons.BrandDiscord: ImageVector
    get() {
        if (_brandDiscord != null) {
            return _brandDiscord!!
        }
        _brandDiscord = Builder(name = "BrandDiscord", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 17.0f)
                curveToRelative(0.0f, 1.0f, 1.5f, 3.0f, 2.0f, 3.0f)
                curveToRelative(1.5f, 0.0f, 2.833f, -1.667f, 3.5f, -3.0f)
                curveToRelative(0.667f, -1.667f, 0.5f, -5.833f, -1.5f, -11.5f)
                curveToRelative(-1.457f, -1.015f, -3.0f, -1.34f, -4.5f, -1.5f)
                lineToRelative(-0.972f, 1.923f)
                arcToRelative(11.913f, 11.913f, 0.0f, false, false, -4.053f, 0.0f)
                lineToRelative(-0.975f, -1.923f)
                curveToRelative(-1.5f, 0.16f, -3.043f, 0.485f, -4.5f, 1.5f)
                curveToRelative(-2.0f, 5.667f, -2.167f, 9.833f, -1.5f, 11.5f)
                curveToRelative(0.667f, 1.333f, 2.0f, 3.0f, 3.5f, 3.0f)
                curveToRelative(0.5f, 0.0f, 2.0f, -2.0f, 2.0f, -3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 16.5f)
                curveToRelative(3.5f, 1.0f, 6.5f, 1.0f, 10.0f, 0.0f)
            }
        }
        .build()
        return _brandDiscord!!
    }

private var _brandDiscord: ImageVector? = null
