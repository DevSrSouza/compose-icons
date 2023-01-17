package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Steelseries: ImageVector
    get() {
        if (_steelseries != null) {
            return _steelseries!!
        }
        _steelseries = Builder(name = "Steelseries", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0801f, 0.0f)
                curveToRelative(-1.0023f, 0.0f, -1.8125f, 0.8089f, -1.8125f, 1.8086f)
                verticalLineToRelative(2.5723f)
                curveToRelative(-4.0187f, 0.7444f, -7.195f, 3.9119f, -7.9395f, 7.9199f)
                lineTo(1.8125f, 12.3008f)
                curveToRelative(-1.001f, 0.0f, -1.8125f, 0.807f, -1.8125f, 1.8066f)
                curveToRelative(0.0f, 0.9983f, 0.8115f, 1.8086f, 1.8125f, 1.8086f)
                horizontalLineToRelative(2.5156f)
                curveTo(5.1808f, 20.5094f, 9.2288f, 24.0f, 14.0801f, 24.0f)
                curveTo(19.5488f, 24.0f, 24.0f, 19.5615f, 24.0f, 14.1074f)
                curveToRelative(0.0f, -4.8366f, -3.5007f, -8.8752f, -8.1074f, -9.7266f)
                lineTo(15.8926f, 1.8086f)
                curveTo(15.8926f, 0.8089f, 15.0811f, 0.0f, 14.0801f, 0.0f)
                close()
                moveTo(4.6934f, 3.1758f)
                curveToRelative(-1.0037f, 0.0f, -1.8164f, 0.8095f, -1.8164f, 1.8105f)
                curveToRelative(0.0f, 0.9997f, 0.8127f, 1.8125f, 1.8164f, 1.8125f)
                curveToRelative(1.001f, 0.0f, 1.8164f, -0.8128f, 1.8164f, -1.8125f)
                curveToRelative(0.0f, -1.001f, -0.8154f, -1.8105f, -1.8164f, -1.8105f)
                close()
                moveTo(14.0801f, 7.832f)
                curveToRelative(3.4681f, 0.0f, 6.293f, 2.814f, 6.293f, 6.2754f)
                curveToRelative(0.0f, 3.4601f, -2.8249f, 6.2773f, -6.293f, 6.2773f)
                curveToRelative(-3.4694f, 0.0f, -6.293f, -2.8173f, -6.293f, -6.2773f)
                curveToRelative(0.0f, -3.4614f, 2.8235f, -6.2754f, 6.293f, -6.2754f)
                close()
                moveTo(14.0625f, 10.2363f)
                curveToRelative(-2.1463f, 0.0f, -3.8926f, 1.7399f, -3.8926f, 3.8809f)
                reflectiveCurveTo(11.9162f, 18.0f, 14.0625f, 18.0f)
                curveToRelative(2.1463f, 0.0f, 3.8926f, -1.7418f, 3.8926f, -3.8828f)
                curveToRelative(0.0f, -2.141f, -1.7462f, -3.8809f, -3.8926f, -3.8809f)
                close()
                moveTo(14.0625f, 12.9531f)
                curveToRelative(0.6455f, 0.0f, 1.168f, 0.5199f, 1.168f, 1.1641f)
                curveToRelative(0.0f, 0.6428f, -0.5225f, 1.168f, -1.168f, 1.168f)
                curveToRelative(-0.6442f, 0.0f, -1.1699f, -0.5251f, -1.1699f, -1.168f)
                curveToRelative(0.0f, -0.6442f, 0.5257f, -1.1641f, 1.1699f, -1.1641f)
                close()
            }
        }
        .build()
        return _steelseries!!
    }

private var _steelseries: ImageVector? = null
