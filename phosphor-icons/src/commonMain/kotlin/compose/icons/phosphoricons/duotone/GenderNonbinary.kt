package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) {
            return _genderNonbinary!!
        }
        _genderNonbinary = Builder(name = "GenderNonbinary", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 88.4f)
                verticalLineTo(59.0f)
                lineToRelative(23.3f, 15.6f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, false, 4.4f, 1.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.5f, -14.6f)
                lineTo(142.3f, 44.0f)
                lineToRelative(25.9f, -17.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.9f, -13.2f)
                lineTo(128.0f, 34.4f)
                lineToRelative(-31.3f, -21.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.9f, 13.2f)
                lineTo(113.7f, 44.0f)
                lineTo(87.8f, 61.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 92.3f, 76.0f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, false, 4.4f, -1.4f)
                lineTo(120.0f, 59.0f)
                verticalLineTo(88.4f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, 16.0f, 0.0f)
                close()
                moveTo(128.0f, 224.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 60.0f, -60.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 128.0f, 224.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 164.0f)
                moveToRelative(-68.0f, 0.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 136.0f, 0.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, -136.0f, 0.0f)
            }
        }
        .build()
        return _genderNonbinary!!
    }

private var _genderNonbinary: ImageVector? = null
