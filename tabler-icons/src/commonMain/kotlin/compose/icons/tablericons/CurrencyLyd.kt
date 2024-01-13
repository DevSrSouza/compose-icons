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

public val TablerIcons.CurrencyLyd: ImageVector
    get() {
        if (_currencyLyd != null) {
            return _currencyLyd!!
        }
        _currencyLyd = Builder(name = "CurrencyLyd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 15.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-2.764f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.789f, -1.106f)
                lineToRelative(-0.447f, -0.894f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 8.0f)
                lineToRelative(2.773f, 4.687f)
                curveToRelative(0.427f, 0.697f, 0.234f, 1.626f, -0.43f, 2.075f)
                arcToRelative(1.38f, 1.38f, 0.0f, false, true, -0.773f, 0.238f)
                horizontalLineToRelative(-2.224f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, true, -0.673f, -0.293f)
                lineToRelative(-0.673f, -0.707f)
            }
        }
        .build()
        return _currencyLyd!!
    }

private var _currencyLyd: ImageVector? = null
