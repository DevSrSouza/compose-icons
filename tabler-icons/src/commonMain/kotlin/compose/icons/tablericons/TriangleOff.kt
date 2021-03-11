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

public val TablerIcons.TriangleOff: ImageVector
    get() {
        if (_triangleOff != null) {
            return _triangleOff!!
        }
        _triangleOff = Builder(name = "TriangleOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 19.0f)
                horizontalLineToRelative(14.0f)
                moveToRelative(1.986f, -2.014f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.146f, -0.736f)
                lineToRelative(-7.1f, -12.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.5f, 0.0f)
                lineToRelative(-0.825f, 1.424f)
                moveToRelative(-1.467f, 2.53f)
                lineToRelative(-4.808f, 8.296f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.75f, 2.75f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _triangleOff!!
    }

private var _triangleOff: ImageVector? = null
