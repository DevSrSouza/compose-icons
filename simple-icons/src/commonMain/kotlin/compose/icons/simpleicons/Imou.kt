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

public val SimpleIcons.Imou: ImageVector
    get() {
        if (_imou != null) {
            return _imou!!
        }
        _imou = Builder(name = "Imou", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.6426f, 9.1484f)
                curveToRelative(-1.5747f, 0.0f, -2.8555f, 1.279f, -2.8555f, 2.8516f)
                curveToRelative(0.0f, 1.5724f, 1.2808f, 2.8516f, 2.8555f, 2.8516f)
                curveToRelative(1.5748f, 0.0f, 2.8554f, -1.2792f, 2.8554f, -2.8516f)
                curveToRelative(0.0f, -1.5725f, -1.2806f, -2.8516f, -2.8554f, -2.8516f)
                close()
                moveTo(4.8242f, 9.1543f)
                curveToRelative(-1.3802f, 0.0f, -2.502f, 1.12f, -2.502f, 2.498f)
                verticalLineToRelative(2.9532f)
                curveToRelative(0.0f, 0.0886f, 0.0714f, 0.1601f, 0.1602f, 0.1601f)
                horizontalLineToRelative(0.9727f)
                arcToRelative(0.1598f, 0.1598f, 0.0f, false, false, 0.1601f, -0.1601f)
                verticalLineToRelative(-2.9532f)
                curveToRelative(0.0f, -0.6656f, 0.5425f, -1.207f, 1.209f, -1.207f)
                curveToRelative(0.6667f, 0.0f, 1.209f, 0.5414f, 1.209f, 1.207f)
                verticalLineToRelative(2.9532f)
                curveToRelative(0.0f, 0.0886f, 0.0733f, 0.1601f, 0.1621f, 0.1601f)
                horizontalLineToRelative(0.9707f)
                arcToRelative(0.1615f, 0.1615f, 0.0f, false, false, 0.1621f, -0.1601f)
                verticalLineToRelative(-2.9532f)
                curveToRelative(0.0f, -0.6656f, 0.5423f, -1.207f, 1.209f, -1.207f)
                curveToRelative(0.6665f, 0.0f, 1.209f, 0.5414f, 1.209f, 1.207f)
                verticalLineToRelative(2.9532f)
                curveToRelative(0.0f, 0.0886f, 0.0714f, 0.1601f, 0.1601f, 0.1601f)
                horizontalLineToRelative(0.9727f)
                arcToRelative(0.1598f, 0.1598f, 0.0f, false, false, 0.1602f, -0.1601f)
                verticalLineToRelative(-2.9532f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.498f, -2.502f, -2.498f)
                curveToRelative(-0.7367f, 0.0f, -1.397f, 0.3209f, -1.8555f, 0.8281f)
                curveToRelative(-0.4582f, -0.5072f, -1.1209f, -0.8281f, -1.8574f, -0.8281f)
                close()
                moveTo(0.1602f, 9.2852f)
                arcTo(0.1596f, 0.1596f, 0.0f, false, false, 0.0f, 9.4453f)
                verticalLineToRelative(5.1602f)
                curveToRelative(0.0f, 0.0888f, 0.0714f, 0.1601f, 0.1602f, 0.1601f)
                horizontalLineToRelative(0.9628f)
                arcToRelative(0.1614f, 0.1614f, 0.0f, false, false, 0.1622f, -0.1601f)
                lineTo(1.2852f, 9.4453f)
                arcToRelative(0.1615f, 0.1615f, 0.0f, false, false, -0.1622f, -0.1601f)
                lineTo(0.1602f, 9.2852f)
                close()
                moveTo(18.4492f, 9.2852f)
                arcToRelative(0.1612f, 0.1612f, 0.0f, false, false, -0.162f, 0.1601f)
                verticalLineToRelative(1.4492f)
                curveToRelative(0.0f, 0.089f, 0.073f, 0.1602f, 0.162f, 0.1602f)
                horizontalLineToRelative(0.963f)
                arcToRelative(0.1596f, 0.1596f, 0.0f, false, false, 0.16f, -0.1602f)
                lineTo(19.5722f, 9.4453f)
                arcToRelative(0.1596f, 0.1596f, 0.0f, false, false, -0.16f, -0.1601f)
                horizontalLineToRelative(-0.963f)
                close()
                moveTo(22.877f, 9.2852f)
                arcToRelative(0.1612f, 0.1612f, 0.0f, false, false, -0.1622f, 0.1601f)
                verticalLineToRelative(1.4492f)
                curveToRelative(0.0f, 0.089f, 0.0732f, 0.1602f, 0.1622f, 0.1602f)
                horizontalLineToRelative(0.9628f)
                arcTo(0.1596f, 0.1596f, 0.0f, false, false, 24.0f, 10.8945f)
                lineTo(24.0f, 9.4453f)
                arcToRelative(0.1596f, 0.1596f, 0.0f, false, false, -0.1602f, -0.1601f)
                horizontalLineToRelative(-0.9628f)
                close()
                moveTo(14.6426f, 10.4316f)
                curveToRelative(0.8663f, 0.0f, 1.5703f, 0.7035f, 1.5703f, 1.5684f)
                curveToRelative(0.0f, 0.865f, -0.704f, 1.5684f, -1.5703f, 1.5684f)
                curveToRelative(-0.8664f, 0.0f, -1.5723f, -0.7035f, -1.5723f, -1.5684f)
                curveToRelative(0.0f, -0.865f, 0.706f, -1.5684f, 1.5723f, -1.5684f)
                close()
                moveTo(18.4492f, 11.6895f)
                arcToRelative(0.1615f, 0.1615f, 0.0f, false, false, -0.162f, 0.1601f)
                verticalLineToRelative(0.08f)
                curveToRelative(0.0f, 1.5443f, 1.2004f, 2.8615f, 2.746f, 2.92f)
                curveTo(22.6579f, 14.9108f, 24.0f, 13.6088f, 24.0f, 12.0f)
                verticalLineToRelative(-0.1504f)
                arcToRelative(0.1598f, 0.1598f, 0.0f, false, false, -0.1602f, -0.1601f)
                horizontalLineToRelative(-0.9628f)
                arcToRelative(0.1615f, 0.1615f, 0.0f, false, false, -0.1622f, 0.1601f)
                lineTo(22.7148f, 12.0f)
                curveToRelative(0.0f, 0.8651f, -0.704f, 1.5684f, -1.5703f, 1.5684f)
                curveToRelative(-0.8663f, 0.0f, -1.5722f, -0.7033f, -1.5722f, -1.5684f)
                verticalLineToRelative(-0.1504f)
                arcToRelative(0.1597f, 0.1597f, 0.0f, false, false, -0.1602f, -0.1601f)
                horizontalLineToRelative(-0.9629f)
                close()
            }
        }
        .build()
        return _imou!!
    }

private var _imou: ImageVector? = null
