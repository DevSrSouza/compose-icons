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

public val TablerIcons.BrandBitbucket: ImageVector
    get() {
        if (_brandBitbucket != null) {
            return _brandBitbucket!!
        }
        _brandBitbucket = Builder(name = "BrandBitbucket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.648f, 4.0f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, -0.64f, 0.744f)
                lineToRelative(3.14f, 14.528f)
                curveToRelative(0.07f, 0.417f, 0.43f, 0.724f, 0.852f, 0.728f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.644f, 0.644f, 0.0f, false, false, 0.642f, -0.539f)
                lineToRelative(3.35f, -14.71f)
                arcToRelative(0.641f, 0.641f, 0.0f, false, false, -0.64f, -0.744f)
                lineToRelative(-16.704f, -0.007f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 15.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-1.0f, -6.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _brandBitbucket!!
    }

private var _brandBitbucket: ImageVector? = null
