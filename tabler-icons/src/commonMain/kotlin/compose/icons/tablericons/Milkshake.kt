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

public val TablerIcons.Milkshake: ImageVector
    get() {
        if (_milkshake != null) {
            return _milkshake!!
        }
        _milkshake = Builder(name = "Milkshake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -10.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 10.0f)
                lineTo(17.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 11.0f)
                lineTo(18.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 12.0f)
                lineTo(6.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 13.0f)
                lineToRelative(1.81f, 7.243f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.97f, 0.757f)
                horizontalLineToRelative(4.44f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.97f, -0.757f)
                lineToRelative(1.81f, -7.243f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                verticalLineToRelative(-2.0f)
            }
        }
        .build()
        return _milkshake!!
    }

private var _milkshake: ImageVector? = null
