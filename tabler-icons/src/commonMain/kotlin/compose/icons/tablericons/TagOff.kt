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

public val TablerIcons.TagOff: ImageVector
    get() {
        if (_tagOff != null) {
            return _tagOff!!
        }
        _tagOff = Builder(name = "TagOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.792f, 7.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 1.414f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.88f, 4.877f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, -0.88f, 2.123f)
                verticalLineToRelative(3.859f)
                curveToRelative(0.0f, 0.537f, 0.213f, 1.052f, 0.593f, 1.432f)
                lineToRelative(8.116f, 8.116f)
                arcToRelative(2.025f, 2.025f, 0.0f, false, false, 2.864f, 0.0f)
                lineToRelative(2.416f, -2.416f)
                moveToRelative(2.002f, -2.002f)
                lineToRelative(0.416f, -0.416f)
                arcToRelative(2.025f, 2.025f, 0.0f, false, false, 0.0f, -2.864f)
                lineToRelative(-8.117f, -8.116f)
                arcToRelative(2.025f, 2.025f, 0.0f, false, false, -1.431f, -0.593f)
                horizontalLineToRelative(-2.859f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _tagOff!!
    }

private var _tagOff: ImageVector? = null
