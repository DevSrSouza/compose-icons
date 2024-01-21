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

public val TablerIcons.BrandPhp: ImageVector
    get() {
        if (_brandPhp != null) {
            return _brandPhp!!
        }
        _brandPhp = Builder(name = "BrandPhp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 9.0f, 0.0f, true, false, 20.0f, 0.0f)
                arcToRelative(10.0f, 9.0f, 0.0f, true, false, -20.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 15.0f)
                lineToRelative(0.395f, -1.974f)
                lineToRelative(0.605f, -3.026f)
                horizontalLineToRelative(1.32f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.986f, 1.164f)
                lineToRelative(-0.167f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.986f, 0.836f)
                horizontalLineToRelative(-1.653f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 15.0f)
                lineToRelative(0.395f, -1.974f)
                lineToRelative(0.605f, -3.026f)
                horizontalLineToRelative(1.32f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.986f, 1.164f)
                lineToRelative(-0.167f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.986f, 0.836f)
                horizontalLineToRelative(-1.653f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.5f)
                lineToRelative(-1.0f, 5.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.6f, 10.0f)
                horizontalLineToRelative(2.4f)
                lineToRelative(-0.5f, 3.0f)
            }
        }
        .build()
        return _brandPhp!!
    }

private var _brandPhp: ImageVector? = null
