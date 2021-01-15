package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Paint: ImageVector
    get() {
        if (_paint != null) {
            return _paint!!
        }
        _paint = Builder(name = "Paint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                lineTo(17.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 5.0f)
                lineTo(19.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 9.0f)
                lineTo(7.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 7.0f)
                lineTo(5.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.0f, 5.0f)
                lineToRelative(-5.0f, 0.0f)
                verticalLineToRelative(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 15.0f)
                lineTo(13.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 16.0f)
                lineTo(14.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 21.0f)
                lineTo(11.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 20.0f)
                lineTo(10.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 15.0f)
                close()
            }
        }
        .build()
        return _paint!!
    }

private var _paint: ImageVector? = null
