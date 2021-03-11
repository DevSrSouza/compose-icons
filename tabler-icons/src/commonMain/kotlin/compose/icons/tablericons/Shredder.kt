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

public val TablerIcons.Shredder: ImageVector
    get() {
        if (_shredder != null) {
            return _shredder!!
        }
        _shredder = Builder(name = "Shredder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 10.0f)
                lineTo(19.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 11.0f)
                lineTo(20.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 15.0f)
                lineTo(5.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 14.0f)
                lineTo(4.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 10.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                moveToRelative(5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                moveToRelative(4.0f, -5.0f)
                verticalLineToRelative(2.0f)
                moveToRelative(-8.0f, -2.0f)
                verticalLineToRelative(3.0f)
            }
        }
        .build()
        return _shredder!!
    }

private var _shredder: ImageVector? = null
