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

public val TablerIcons.MailFast: ImageVector
    get() {
        if (_mailFast != null) {
            return _mailFast!!
        }
        _mailFast = Builder(name = "MailFast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 7.0f)
                horizontalLineToRelative(3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 11.0f)
                horizontalLineToRelative(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.02f, 8.801f)
                lineToRelative(-0.6f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.99f, 2.199f)
                horizontalLineToRelative(7.98f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.99f, -1.801f)
                lineToRelative(0.6f, -6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.99f, -2.199f)
                horizontalLineToRelative(-7.98f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.99f, 1.801f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.8f, 7.5f)
                lineToRelative(2.982f, 3.28f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.238f, 0.202f)
                lineToRelative(3.28f, -2.982f)
            }
        }
        .build()
        return _mailFast!!
    }

private var _mailFast: ImageVector? = null
