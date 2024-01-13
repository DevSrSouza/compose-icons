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

public val TablerIcons.Nut: ImageVector
    get() {
        if (_nut != null) {
            return _nut!!
        }
        _nut = Builder(name = "Nut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 6.84f)
                arcToRelative(2.007f, 2.007f, 0.0f, false, true, 1.0f, 1.754f)
                verticalLineToRelative(6.555f)
                curveToRelative(0.0f, 0.728f, -0.394f, 1.4f, -1.03f, 1.753f)
                lineToRelative(-6.0f, 3.844f)
                arcToRelative(1.995f, 1.995f, 0.0f, false, true, -1.94f, 0.0f)
                lineToRelative(-6.0f, -3.844f)
                arcToRelative(2.006f, 2.006f, 0.0f, false, true, -1.03f, -1.752f)
                verticalLineToRelative(-6.557f)
                curveToRelative(0.0f, -0.728f, 0.394f, -1.399f, 1.03f, -1.753f)
                lineToRelative(6.0f, -3.582f)
                arcToRelative(2.049f, 2.049f, 0.0f, false, true, 2.0f, 0.0f)
                lineToRelative(6.0f, 3.582f)
                horizontalLineToRelative(-0.03f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
            }
        }
        .build()
        return _nut!!
    }

private var _nut: ImageVector? = null
