package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.DomainRemove: ImageVector
    get() {
        if (_domainRemove != null) {
            return _domainRemove!!
        }
        _domainRemove = Builder(name = "DomainRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.35f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 13.0f, 19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.35f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 14.0f, 15.69f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.09f)
                arcTo(5.58f, 5.58f, 0.0f, false, true, 22.0f, 13.81f)
                verticalLineTo(7.0f)
                moveTo(6.0f, 19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                moveTo(6.0f, 15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                moveTo(6.0f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                moveTo(6.0f, 7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                moveTo(10.0f, 19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                moveTo(10.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                moveTo(10.0f, 11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                moveTo(10.0f, 7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                moveTo(16.0f, 13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                moveTo(16.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                moveTo(16.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                moveTo(22.54f, 16.88f)
                lineTo(20.41f, 19.0f)
                lineTo(22.54f, 21.12f)
                lineTo(21.12f, 22.54f)
                lineTo(19.0f, 20.41f)
                lineTo(16.88f, 22.54f)
                lineTo(15.46f, 21.12f)
                lineTo(17.59f, 19.0f)
                lineTo(15.46f, 16.88f)
                lineTo(16.88f, 15.46f)
                lineTo(19.0f, 17.59f)
                lineTo(21.12f, 15.46f)
                close()
            }
        }
        .build()
        return _domainRemove!!
    }

private var _domainRemove: ImageVector? = null
