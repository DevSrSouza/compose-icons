package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.VideoPerson: ImageVector
    get() {
        if (_videoPerson != null) {
            return _videoPerson!!
        }
        _videoPerson = Builder(name = "VideoPerson", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7454f, 4.0f)
                curveTo(20.988f, 4.0f, 21.9954f, 5.0074f, 21.9954f, 6.25f)
                verticalLineTo(17.7546f)
                curveTo(21.9954f, 18.9972f, 20.988f, 20.0046f, 19.7454f, 20.0046f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 20.0046f, 2.0f, 18.9972f, 2.0f, 17.7546f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 5.0074f, 3.0074f, 4.0f, 4.25f, 4.0f)
                horizontalLineTo(19.7454f)
                close()
                moveTo(19.7454f, 5.5f)
                horizontalLineTo(4.25f)
                curveTo(3.8358f, 5.5f, 3.5f, 5.8358f, 3.5f, 6.25f)
                verticalLineTo(17.7546f)
                curveTo(3.5f, 18.1688f, 3.8358f, 18.5046f, 4.25f, 18.5046f)
                lineTo(6.999f, 18.504f)
                lineTo(7.0f, 15.75f)
                curveTo(7.0f, 14.8318f, 7.7071f, 14.0788f, 8.6065f, 14.0058f)
                lineTo(8.75f, 14.0f)
                horizontalLineTo(15.2447f)
                curveTo(16.1629f, 14.0f, 16.9159f, 14.7071f, 16.9889f, 15.6065f)
                lineTo(16.9947f, 15.75f)
                lineTo(16.994f, 18.504f)
                lineTo(19.7454f, 18.5046f)
                curveTo(20.1596f, 18.5046f, 20.4954f, 18.1688f, 20.4954f, 17.7546f)
                verticalLineTo(6.25f)
                curveTo(20.4954f, 5.8358f, 20.1596f, 5.5f, 19.7454f, 5.5f)
                close()
                moveTo(12.0f, 7.0005f)
                curveTo(13.6569f, 7.0005f, 15.0f, 8.3436f, 15.0f, 10.0005f)
                curveTo(15.0f, 11.6573f, 13.6569f, 13.0005f, 12.0f, 13.0005f)
                curveTo(10.3431f, 13.0005f, 9.0f, 11.6573f, 9.0f, 10.0005f)
                curveTo(9.0f, 8.3436f, 10.3431f, 7.0005f, 12.0f, 7.0005f)
                close()
            }
        }
        .build()
        return _videoPerson!!
    }

private var _videoPerson: ImageVector? = null
