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

public val TablerIcons.Tags: ImageVector
    get() {
        if (_tags != null) {
            return _tags!!
        }
        _tags = Builder(name = "Tags", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.859f, 6.0f)
                horizontalLineToRelative(-2.834f)
                arcToRelative(2.025f, 2.025f, 0.0f, false, false, -2.025f, 2.025f)
                verticalLineToRelative(2.834f)
                curveToRelative(0.0f, 0.537f, 0.213f, 1.052f, 0.593f, 1.432f)
                lineToRelative(6.116f, 6.116f)
                arcToRelative(2.025f, 2.025f, 0.0f, false, false, 2.864f, 0.0f)
                lineToRelative(2.834f, -2.834f)
                arcToRelative(2.025f, 2.025f, 0.0f, false, false, 0.0f, -2.864f)
                lineToRelative(-6.117f, -6.116f)
                arcToRelative(2.025f, 2.025f, 0.0f, false, false, -1.431f, -0.593f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.573f, 18.407f)
                lineToRelative(2.834f, -2.834f)
                arcToRelative(2.025f, 2.025f, 0.0f, false, false, 0.0f, -2.864f)
                lineToRelative(-7.117f, -7.116f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 9.0f)
                horizontalLineToRelative(-0.01f)
            }
        }
        .build()
        return _tags!!
    }

private var _tags: ImageVector? = null
