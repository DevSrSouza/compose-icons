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

public val TablerIcons.Pyramid: ImageVector
    get() {
        if (_pyramid != null) {
            return _pyramid!!
        }
        _pyramid = Builder(name = "Pyramid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.105f, 21.788f)
                arcToRelative(1.994f, 1.994f, 0.0f, false, false, 1.789f, 0.0f)
                lineToRelative(8.092f, -4.054f)
                curveToRelative(0.538f, -0.27f, 0.718f, -0.951f, 0.385f, -1.452f)
                lineToRelative(-8.54f, -13.836f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.664f, 0.0f)
                lineToRelative(-8.54f, 13.836f)
                arcToRelative(1.005f, 1.005f, 0.0f, false, false, 0.386f, 1.452f)
                lineToRelative(8.092f, 4.054f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineToRelative(20.0f)
            }
        }
        .build()
        return _pyramid!!
    }

private var _pyramid: ImageVector? = null
