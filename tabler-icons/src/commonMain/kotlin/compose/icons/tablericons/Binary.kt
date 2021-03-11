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

public val TablerIcons.Binary: ImageVector
    get() {
        if (_binary != null) {
            return _binary!!
        }
        _binary = Builder(name = "Binary", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 10.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-1.0f)
                moveToRelative(8.0f, 14.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 5.0f)
                lineTo(17.5f, 5.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 18.0f, 5.5f)
                lineTo(18.0f, 9.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 17.5f, 10.0f)
                lineTo(15.5f, 10.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 15.0f, 9.5f)
                lineTo(15.0f, 5.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 15.5f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 14.0f)
                lineTo(12.5f, 14.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 13.0f, 14.5f)
                lineTo(13.0f, 18.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 12.5f, 19.0f)
                lineTo(10.5f, 19.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 18.5f)
                lineTo(10.0f, 14.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.5f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                horizontalLineToRelative(0.01f)
                moveToRelative(-0.01f, 9.0f)
                horizontalLineToRelative(0.01f)
            }
        }
        .build()
        return _binary!!
    }

private var _binary: ImageVector? = null
