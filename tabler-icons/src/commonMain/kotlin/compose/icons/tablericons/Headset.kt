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

public val TablerIcons.Headset: ImageVector
    get() {
        if (_headset != null) {
            return _headset!!
        }
        _headset = Builder(name = "Headset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 13.0f)
                lineTo(6.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 15.0f)
                lineTo(8.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 19.0f)
                lineTo(6.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 17.0f)
                lineTo(4.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                lineTo(18.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 15.0f)
                lineTo(20.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 19.0f)
                lineTo(18.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 17.0f)
                lineTo(16.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 15.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 19.0f)
                arcToRelative(6.0f, 3.0f, 0.0f, false, true, -6.0f, 3.0f)
            }
        }
        .build()
        return _headset!!
    }

private var _headset: ImageVector? = null
