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

public val TablerIcons.Server2: ImageVector
    get() {
        if (_server2 != null) {
            return _server2!!
        }
        _server2 = Builder(name = "Server2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                lineTo(18.0f, 4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.0f, 7.0f)
                lineTo(21.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 12.0f)
                lineTo(6.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 9.0f)
                lineTo(3.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                lineTo(18.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.0f, 15.0f)
                lineTo(21.0f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 17.0f)
                lineTo(3.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 8.0f)
                lineTo(7.0f, 8.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 16.0f)
                lineTo(7.0f, 16.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 8.0f)
                horizontalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 16.0f)
                horizontalLineToRelative(6.0f)
            }
        }
        .build()
        return _server2!!
    }

private var _server2: ImageVector? = null
