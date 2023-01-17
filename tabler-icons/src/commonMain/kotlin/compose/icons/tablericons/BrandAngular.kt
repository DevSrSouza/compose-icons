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

public val TablerIcons.BrandAngular: ImageVector
    get() {
        if (_brandAngular != null) {
            return _brandAngular!!
        }
        _brandAngular = Builder(name = "BrandAngular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.428f, 17.245f)
                lineToRelative(6.076f, 3.471f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.992f, 0.0f)
                lineToRelative(6.076f, -3.471f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.495f, -0.734f)
                lineToRelative(1.323f, -9.704f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.658f, -1.078f)
                lineToRelative(-7.4f, -2.612f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.665f, 0.0f)
                lineToRelative(-7.399f, 2.613f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.658f, 1.078f)
                lineToRelative(1.323f, 9.704f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.495f, 0.734f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 15.0f)
                lineToRelative(3.0f, -8.0f)
                lineToRelative(3.0f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 13.0f)
                horizontalLineToRelative(4.0f)
            }
        }
        .build()
        return _brandAngular!!
    }

private var _brandAngular: ImageVector? = null
