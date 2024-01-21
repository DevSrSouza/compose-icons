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

public val TablerIcons.BrandKakoTalk: ImageVector
    get() {
        if (_brandKakoTalk != null) {
            return _brandKakoTalk!!
        }
        _brandKakoTalk = Builder(name = "BrandKakoTalk", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                verticalLineToRelative(7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                lineToRelative(-2.0f, 2.5f)
                lineToRelative(2.0f, 2.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(4.97f, 0.0f, 9.0f, 3.358f, 9.0f, 7.5f)
                curveToRelative(0.0f, 4.142f, -4.03f, 7.5f, -9.0f, 7.5f)
                curveToRelative(-0.67f, 0.0f, -1.323f, -0.061f, -1.95f, -0.177f)
                lineToRelative(-3.05f, 2.177f)
                lineToRelative(0.592f, -2.962f)
                curveToRelative(-2.741f, -1.284f, -4.592f, -3.73f, -4.592f, -6.538f)
                curveToRelative(0.0f, -4.142f, 4.03f, -7.5f, 9.0f, -7.5f)
                close()
            }
        }
        .build()
        return _brandKakoTalk!!
    }

private var _brandKakoTalk: ImageVector? = null
