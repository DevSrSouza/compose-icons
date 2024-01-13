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

public val TablerIcons.BrandXamarin: ImageVector
    get() {
        if (_brandXamarin != null) {
            return _brandXamarin!!
        }
        _brandXamarin = Builder(name = "BrandXamarin", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.958f, 21.0f)
                horizontalLineToRelative(-7.917f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.732f, -1.0f)
                lineToRelative(-4.041f, -7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.0f)
                lineToRelative(4.041f, -7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.732f, -1.0f)
                horizontalLineToRelative(7.917f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.732f, 1.0f)
                lineToRelative(4.042f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineToRelative(-4.041f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.733f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 16.0f)
                lineToRelative(-6.0f, -8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 16.0f)
                lineToRelative(6.0f, -8.0f)
            }
        }
        .build()
        return _brandXamarin!!
    }

private var _brandXamarin: ImageVector? = null
