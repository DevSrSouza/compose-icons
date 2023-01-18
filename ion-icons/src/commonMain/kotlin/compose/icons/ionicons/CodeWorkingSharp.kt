package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Square as StrokeCapSquare
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.CodeWorkingSharp: ImageVector
    get() {
        if (_codeWorkingSharp != null) {
            return _codeWorkingSharp!!
        }
        _codeWorkingSharp = Builder(name = "CodeWorkingSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 10.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-26.0f, 0.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 52.0f, 0.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, -52.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 10.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(346.0f, 256.0f)
                moveToRelative(-26.0f, 0.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 52.0f, 0.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, -52.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 10.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(166.0f, 256.0f)
                moveToRelative(-26.0f, 0.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 52.0f, 0.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, -52.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 42.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 368.0f)
                lineToRelative(-128.0f, -112.0f)
                lineToRelative(128.0f, -112.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 42.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(352.0f, 368.0f)
                lineToRelative(128.0f, -112.0f)
                lineToRelative(-128.0f, -112.0f)
            }
        }
        .build()
        return _codeWorkingSharp!!
    }

private var _codeWorkingSharp: ImageVector? = null