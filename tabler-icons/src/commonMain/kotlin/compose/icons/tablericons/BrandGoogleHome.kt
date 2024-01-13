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

public val TablerIcons.BrandGoogleHome: ImageVector
    get() {
        if (_brandGoogleHome != null) {
            return _brandGoogleHome!!
        }
        _brandGoogleHome = Builder(name = "BrandGoogleHome", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.072f, 21.0f)
                horizontalLineToRelative(-14.144f)
                arcToRelative(1.928f, 1.928f, 0.0f, false, true, -1.928f, -1.928f)
                verticalLineToRelative(-6.857f)
                curveToRelative(0.0f, -0.512f, 0.203f, -1.0f, 0.566f, -1.365f)
                lineToRelative(7.07f, -7.063f)
                arcToRelative(1.928f, 1.928f, 0.0f, false, true, 2.727f, 0.0f)
                lineToRelative(7.071f, 7.063f)
                curveToRelative(0.363f, 0.362f, 0.566f, 0.853f, 0.566f, 1.365f)
                verticalLineToRelative(6.857f)
                arcToRelative(1.928f, 1.928f, 0.0f, false, true, -1.928f, 1.928f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 13.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-4.0f)
                lineToRelative(-5.0f, -5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.8f, 5.2f)
                lineToRelative(-11.8f, 11.8f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 17.0f)
                verticalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 17.0f)
                verticalLineToRelative(4.0f)
            }
        }
        .build()
        return _brandGoogleHome!!
    }

private var _brandGoogleHome: ImageVector? = null
