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

public val TablerIcons.Apps: ImageVector
    get() {
        if (_apps != null) {
            return _apps!!
        }
        _apps = Builder(name = "Apps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 5.0f)
                lineTo(10.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 10.0f)
                lineTo(5.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 9.0f)
                lineTo(4.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 14.0f)
                lineTo(9.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 15.0f)
                lineTo(10.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 19.0f)
                lineTo(4.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                lineTo(19.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 15.0f)
                lineTo(20.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 20.0f)
                lineTo(15.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 19.0f)
                lineTo(14.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 7.0f)
                lineTo(20.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                lineTo(17.0f, 10.0f)
            }
        }
        .build()
        return _apps!!
    }

private var _apps: ImageVector? = null
