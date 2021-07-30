package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) {
            return _shoppingBag!!
        }
        _shoppingBag = Builder(name = "ShoppingBag", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 160.0f)
                verticalLineToRelative(-32.0f)
                curveTo(352.0f, 57.42f, 294.579f, 0.0f, 224.0f, 0.0f)
                curveTo(153.42f, 0.0f, 96.0f, 57.42f, 96.0f, 128.0f)
                verticalLineToRelative(32.0f)
                lineTo(0.0f, 160.0f)
                verticalLineToRelative(272.0f)
                curveToRelative(0.0f, 44.183f, 35.817f, 80.0f, 80.0f, 80.0f)
                horizontalLineToRelative(288.0f)
                curveToRelative(44.183f, 0.0f, 80.0f, -35.817f, 80.0f, -80.0f)
                lineTo(448.0f, 160.0f)
                horizontalLineToRelative(-96.0f)
                close()
                moveTo(160.0f, 128.0f)
                curveToRelative(0.0f, -35.29f, 28.71f, -64.0f, 64.0f, -64.0f)
                reflectiveCurveToRelative(64.0f, 28.71f, 64.0f, 64.0f)
                verticalLineToRelative(32.0f)
                lineTo(160.0f, 160.0f)
                verticalLineToRelative(-32.0f)
                close()
                moveTo(320.0f, 248.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, -10.745f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.745f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.745f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.745f, 24.0f, -24.0f, 24.0f)
                close()
                moveTo(128.0f, 248.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, -10.745f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.745f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.745f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.745f, 24.0f, -24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
