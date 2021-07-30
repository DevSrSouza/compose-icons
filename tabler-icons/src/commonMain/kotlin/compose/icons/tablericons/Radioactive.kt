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

public val TablerIcons.Radioactive: ImageVector
    get() {
        if (_radioactive != null) {
            return _radioactive!!
        }
        _radioactive = Builder(name = "Radioactive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 14.6f)
                lineToRelative(3.0f, 5.19f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 4.5f, -7.79f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.5f, 2.6f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 9.4f)
                lineToRelative(3.0f, -5.19f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.0f, 0.0f)
                lineToRelative(3.0f, 5.19f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 14.6f)
                lineToRelative(-3.0f, 5.19f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -4.5f, -7.79f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.5f, 2.6f)
            }
        }
        .build()
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
