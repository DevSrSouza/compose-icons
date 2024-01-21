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

public val TablerIcons.BrandCakephp: ImageVector
    get() {
        if (_brandCakephp != null) {
            return _brandCakephp!!
        }
        _brandCakephp = Builder(name = "BrandCakephp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                lineToRelative(8.0f, 2.0f)
                curveToRelative(1.361f, -0.545f, 2.0f, -1.248f, 2.0f, -2.0f)
                verticalLineToRelative(-3.8f)
                curveToRelative(0.0f, -1.765f, -4.479f, -3.2f, -10.002f, -3.2f)
                curveToRelative(-5.522f, 0.0f, -9.998f, 1.435f, -9.998f, 3.2f)
                verticalLineToRelative(2.8f)
                curveToRelative(0.0f, 1.766f, 4.478f, 4.0f, 10.0f, 4.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(8.0f, 2.0f)
                curveToRelative(1.362f, -0.547f, 2.0f, -1.246f, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, 0.754f, -0.638f, 1.453f, -2.0f, 2.0f)
                lineToRelative(-8.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 17.0f)
                curveToRelative(0.0f, 1.766f, 4.476f, 3.0f, 9.998f, 3.0f)
                lineToRelative(0.002f, -3.0f)
                curveToRelative(-5.522f, 0.0f, -10.0f, -1.734f, -10.0f, -3.5f)
                verticalLineToRelative(3.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 10.0f)
                verticalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                verticalLineToRelative(4.0f)
            }
        }
        .build()
        return _brandCakephp!!
    }

private var _brandCakephp: ImageVector? = null
